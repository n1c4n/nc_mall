package com.n1c4n.configuration;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.n1c4n.constant.AuthConstant;
import com.n1c4n.constant.HttpConstant;
import com.n1c4n.service.impl.UserDetailsServiceImpl;
import com.n1c4n.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import java.io.PrintWriter;
import java.time.Duration;
import java.util.HashMap;
import java.util.UUID;

@EnableWebSecurity
public class AuthSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 关闭跨站请求伪造的拦截
        http.csrf().disable()
                .cors().disable();
        // session  STATELESS的策略  关闭 session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        //配置登录信息
        http.formLogin()
                .loginProcessingUrl(AuthConstant.LOGIN_URL)
                .successHandler(authenticationSuccessHandler())
                .failureHandler(authenticationFailureHandler());
        http.logout()
                .logoutUrl(AuthConstant.LOGOUT_URL)
                .logoutSuccessHandler(logoutSuccessHandler());
    }
    /**
     * 登录成功的处理器
     * 获取用户信息
     * 生成 token
     * redis添加 token 和 用户信息
     * 返回 token 给前端
     *
     * @return
     */
    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        return (request, response, authentication) -> {
            //设置响应数据
            response.setContentType(HttpConstant.CONTENT_TYPE);
            response.setCharacterEncoding(HttpConstant.UTF_8);
            //生成 token
            String token = UUID.randomUUID().toString();
            //获取用户信息
            Object principal = authentication.getPrincipal();
            String userJson = JSON.toJSONString(principal);
            //将 token 和用户信息存入 redis
            stringRedisTemplate.opsForValue().set(AuthConstant.LOGIN_TOKEN_PREFIX + token, userJson, Duration.ofSeconds(AuthConstant.TOKEN_EXPIRE_TIME));
            //将 token 返回给前端
            HashMap<String, Object> map = new HashMap<>();
            map.put(AuthConstant.ACCESS_TOKEN, token);
            map.put(AuthConstant.EXPIRES_IN, AuthConstant.TOKEN_EXPIRE_TIME);
            response.getWriter().write(JSON.toJSONString(map));
        };
    }

    /**
     * 登录失败的处理器
     *
     * @return
     */
    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return (request, response, exception) -> {
//            log.error("登录失败:{}", exception.getMessage());
            response.setContentType(HttpConstant.APPLICATION_JSON);
            response.setCharacterEncoding(HttpConstant.UTF_8);
            Result<String> result = new Result<>();
            result.setCode(401);
            if (exception instanceof BadCredentialsException) {
                result.setMsg("用户名或者密码错误");
            } else if (exception instanceof UsernameNotFoundException) {
                result.setMsg("用户名错误");
            } else if (exception instanceof AccountExpiredException) {
                result.setMsg("账号异常，请联系管理员");
            } else if (exception instanceof InternalAuthenticationServiceException) {
                result.setMsg(exception.getMessage());
            } else {
                result.setMsg("未授权");
            }
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(result);
            PrintWriter writer = response.getWriter();
            writer.write(s);
            writer.flush();
            writer.close();
        };
    }

    /**
     * 登出的处理器
     * redis删除
     *
     * @return
     */
    @Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return (request, response, authentication) -> {
            response.setContentType(HttpConstant.APPLICATION_JSON);
            response.setCharacterEncoding(HttpConstant.UTF_8);
            String authorization = request.getHeader(AuthConstant.AUTHORIZATION);
            String token = authorization.replaceFirst(AuthConstant.BEARER, "");
            stringRedisTemplate.delete(AuthConstant.LOGIN_TOKEN_PREFIX + token);
            Result<Object> result = Result.success(null);
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(result);
            PrintWriter writer = response.getWriter();
            writer.write(s);
            writer.flush();
            writer.close();
        };
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
