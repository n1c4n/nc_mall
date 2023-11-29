package com.n1c4n.service.impl;

import com.n1c4n.constant.AuthConstant;
import com.n1c4n.strategy.LoginStrategy;
import com.n1c4n.strategy.LoginStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private LoginStrategyFactory loginStrategyFactory;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        //获取请求中的登录用户类型
        String loginType = request.getHeader(AuthConstant.LOGIN_TYPE);
        // 判断是否正常登录
        if (!StringUtils.hasText(loginType)) {
            throw new RuntimeException("Null login type");
        }
        //工厂模式 + 策略模式 获得不同类型的用户查询方法
        LoginStrategy instance = loginStrategyFactory.getInstance(loginType);
        if (ObjectUtils.isEmpty(instance)) {
            throw new InternalAuthenticationServiceException("Unknown login type");
        }
        return instance.realLogin(username);
    }
}