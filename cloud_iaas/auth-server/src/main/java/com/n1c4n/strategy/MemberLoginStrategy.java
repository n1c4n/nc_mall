package com.n1c4n.strategy;

import com.n1c4n.constant.AuthConstant;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service(AuthConstant.MEMBER)
public class MemberLoginStrategy implements LoginStrategy {

    @Override
    public UserDetails realLogin(String username) {
        return null;
    }

}

