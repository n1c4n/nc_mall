package com.n1c4n.utils;

import com.n1c4n.domain.SecurityUser;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Set;

/**
 * 封装认证相关的信息
 */
public class AuthUtil {

    public static SecurityUser getLoginUser() {
        return (SecurityUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public static Long getUserId() {
        return getLoginUser().getUserId();
    }

    public static Long getShopId() {
        return getLoginUser().getShopId();
    }


    public static Set<String> getPerms() {
        return getLoginUser().getPerms();
    }


    public static String getOpenId() {
        return getLoginUser().getOpenId();
    }
}
