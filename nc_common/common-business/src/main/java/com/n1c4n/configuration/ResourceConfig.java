package com.n1c4n.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.n1c4n.constant.HttpConstant;
import com.n1c4n.constant.ResourceConstant;
import com.n1c4n.filter.TokenTransFilter;
import com.n1c4n.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.PrintWriter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private TokenTransFilter tokenTransFilter;

    /**
     * 这个请求是关于 资源服务器（请求进入具体的服务模块时要做的事）
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 关闭跨站请求伪造的拦截
        http.csrf().disable()
                .cors().disable();
        // session  STATELESS的策略  关闭 session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // 将这个过滤器放在认证过滤器之前
        http.addFilterBefore(tokenTransFilter, UsernamePasswordAuthenticationFilter.class);
        // 认证过滤器
        http.authorizeRequests()
                .antMatchers(ResourceConstant.RESOURCE_ALLOW_URLS) // /actuator/**,/druid/**   swaggerUi
                .permitAll().anyRequest().authenticated();
        // 拒绝访问的一个处理器
        http.exceptionHandling().accessDeniedHandler(accessDeniedHandler());
    }


    /**
     * 请求被拒绝的处理器
     *
     * @return
     */
    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return (request, response, accessDeniedException) -> {
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.setCharacterEncoding(HttpConstant.UTF_8);
            Result<Object> result = Result.fail(403, accessDeniedException.getMessage());
            System.out.println(accessDeniedException.getMessage());
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(result);
            PrintWriter writer = response.getWriter();
            writer.write(s);
            writer.flush();
            writer.close();
        };
    }

}
