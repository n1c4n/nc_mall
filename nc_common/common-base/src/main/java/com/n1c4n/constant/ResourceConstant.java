package com.n1c4n.constant;

public interface ResourceConstant {

    String[] RESOURCE_ALLOW_URLS = {
            "/v2/api-docs",  // swagger  druid ...
            "/v3/api-docs",
            "/swagger-resources/configuration/ui",  //用来获取支持的动作
            "/swagger-resources",                   //用来获取api-docs的URI
            "/swagger-resources/configuration/security",//安全选项
            "/webjars/**",
            "/swagger-ui/**",
            "/druid/**",
            "/actuator/**"
    };

}
