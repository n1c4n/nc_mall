package com.n1c4n.filter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.n1c4n.constant.AuthConstant;
import com.n1c4n.constant.HttpConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class TokenCheckFilter implements GlobalFilter, Ordered {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        //白名单放行
        if (AuthConstant.ALLOW_URLS.contains(path)) {
            return chain.filter(exchange);
        }
        //获取 token 验证，验证通过放行
        //  拿到请求头和token
        List<String> authorization = request.getHeaders().get(AuthConstant.AUTHORIZATION);
        if (!CollectionUtils.isEmpty(authorization)) {
            String authToken = authorization.get(0);
            if (StringUtils.hasText(authToken)) {
                // 处理前缀
                String realToken = authToken.replaceFirst(AuthConstant.BEARER, "");
                if (StringUtils.hasText(realToken) && redisTemplate.hasKey(AuthConstant.LOGIN_TOKEN_PREFIX + realToken)) {
                    return chain.filter(exchange);
                }
            }
        }

        //验证失败，返回错误，要求登录
        //不放行 返回信息
        //设置返回信息类型
        ServerHttpResponse response = exchange.getResponse();
        response.getHeaders().set(HttpConstant.CONTENT_TYPE, HttpConstant.APPLICATION_JSON);
        //设置返回信息
        Map<String, Object> map = new HashMap<>();
        map.put("code", 400);
        map.put("msg", "请登录!");
        //返回信息
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            byte[] bytes = objectMapper.writeValueAsBytes(map);
            DataBuffer wrap = response.bufferFactory().wrap(bytes);
            return response.writeWith(Mono.just(wrap));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getOrder() {
        return -2;
    }
}