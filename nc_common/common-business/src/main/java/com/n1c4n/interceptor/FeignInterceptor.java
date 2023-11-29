package com.n1c4n.interceptor;

import com.n1c4n.constant.AuthConstant;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 专门来处理远程调用的请求
 * 做token的传递机制
 */
@Component
public class FeignInterceptor implements RequestInterceptor {

    /**
     * 拦截即将要发出去的请求的方法
     * 因为远程调用是一个新的request HttpUrlConnection
     * 1.浏览器-----token--->A---------RPC------>B
     * 2.mqListener(定时任务)---------->B  (需要方行部分接口)
     * 3.第三方平台-------->A---------->B  (需要方行部分接口)
     *
     * @param template 即将要发出去的请求对象 这个里面是没有token的
     */
    @Override
    public void apply(RequestTemplate template) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (!ObjectUtils.isEmpty(requestAttributes)) {
            HttpServletRequest request = requestAttributes.getRequest();
            String token = request.getHeader(AuthConstant.AUTHORIZATION);
            if (StringUtils.hasText(token)) {
                // 将这个token往后渗透 传递
                template.header(AuthConstant.AUTHORIZATION, token);
                String loginType = request.getHeader(AuthConstant.LOGIN_TYPE);
                // 用户类型也需要往下传递
                template.header(AuthConstant.LOGIN_TYPE, loginType);
            }

        }

    }
}

