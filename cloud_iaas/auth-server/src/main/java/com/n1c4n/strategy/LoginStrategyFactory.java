package com.n1c4n.strategy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 */
@Component
public class LoginStrategyFactory implements ApplicationContextAware {

    @Autowired
    private Map<String, LoginStrategy> loginStrategyMap = new HashMap<>();

    /**
     * 根据类型返回不同的策略
     *
     * @param loginType
     * @return
     */
    public LoginStrategy getInstance(String loginType) {
        return loginStrategyMap.get(loginType);
    }

    /**
     * 通过上下文对象提供的 getBeanOfType 方法
     * 获得 Map 对象，这个对象的 key 是String 类型的 loginType
     *
     * @return
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, LoginStrategy> beansOfType = applicationContext.getBeansOfType(LoginStrategy.class);
        loginStrategyMap = beansOfType;
    }
}

