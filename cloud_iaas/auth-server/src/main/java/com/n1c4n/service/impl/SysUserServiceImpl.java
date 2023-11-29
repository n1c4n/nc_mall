package com.n1c4n.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.n1c4n.mapper.SysUserMapper;
import com.n1c4n.domain.SysUser;
import com.n1c4n.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 系统用户(SysUser)表服务实现类
 *
 * @author makejava
 * @since 2023-11-28 16:26:46
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}

