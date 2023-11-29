package com.n1c4n.strategy;

import org.springframework.security.core.userdetails.UserDetails;

public interface LoginStrategy {
    /**
     * 策略模式
     */
    UserDetails realLogin(String username);


}
