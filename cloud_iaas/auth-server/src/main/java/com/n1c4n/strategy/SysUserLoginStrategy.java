package com.n1c4n.strategy;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.n1c4n.constant.AuthConstant;
import com.n1c4n.mapper.SysUserMapper;
import com.n1c4n.domain.SecurityUser;
import com.n1c4n.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Set;

@Service(AuthConstant.SYS_USER)
public class SysUserLoginStrategy implements LoginStrategy {

    @Autowired
    private SysUserMapper sysUserDao;

    /**
     * 后台管理员的登录
     *
     * @param username
     * @return
     */
    @Override
    public UserDetails realLogin(String username) {
        SysUser loginSysUser = sysUserDao.selectOne(new LambdaQueryWrapper<SysUser>()
                .eq(SysUser::getUsername, username)
        );
        if (!ObjectUtils.isEmpty(loginSysUser)) {
            SecurityUser securityUser = new SecurityUser();
            // 查询权限
            Set<String> perms = sysUserDao.selectPermsByUserId(loginSysUser.getUserId());
            securityUser.setUserId(loginSysUser.getUserId());
            securityUser.setLoginType(AuthConstant.SYS_USER);
            securityUser.setPassword(loginSysUser.getPassword());
            securityUser.setUsername(loginSysUser.getUsername());
            securityUser.setStatus(loginSysUser.getStatus());
            securityUser.setShopId(loginSysUser.getShopId());
            if (!CollectionUtils.isEmpty(perms)) {
                securityUser.setPerms(perms);
            }
            return securityUser;
        }
        return null;
    }
}
