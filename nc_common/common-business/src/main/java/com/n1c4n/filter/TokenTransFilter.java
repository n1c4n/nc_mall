package com.n1c4n.filter;

import com.alibaba.fastjson.JSON;
import com.n1c4n.constant.AuthConstant;
import com.n1c4n.domain.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Component
public class TokenTransFilter extends OncePerRequestFilter {
    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 1.拿到token
     * 2.判断续约
     * 3.从redis拿到用户str
     * 4.转成SysUser
     * 5.放在securityContext里面去
     *
     * @param request
     * @param response
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorization = request.getHeader(AuthConstant.AUTHORIZATION);
        if (StringUtils.hasText(authorization)) {
            String token = authorization.replaceFirst(AuthConstant.BEARER, "");
            if (StringUtils.hasText(token)) {
                // 判断续约
                Long expire = redisTemplate.getExpire(AuthConstant.LOGIN_TOKEN_PREFIX + token, TimeUnit.SECONDS);
                if (expire < AuthConstant.RENEW_EXPIRE_THRESHOLD) {
                    redisTemplate.expire(AuthConstant.LOGIN_TOKEN_PREFIX + token, Duration.ofSeconds(AuthConstant.TOKEN_EXPIRE_TIME));
                }
                // 转换
                String userStr = redisTemplate.opsForValue().get(AuthConstant.LOGIN_TOKEN_PREFIX + token);
                SecurityUser securityUser = JSON.parseObject(userStr, SecurityUser.class);
                // 处理权限
                Set<SimpleGrantedAuthority> grantedAuthorities = securityUser.getPerms()
                        .stream()
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toSet());
                // threadLocal
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(securityUser, null, grantedAuthorities);
                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            }
        }
        filterChain.doFilter(request, response);
    }

}
