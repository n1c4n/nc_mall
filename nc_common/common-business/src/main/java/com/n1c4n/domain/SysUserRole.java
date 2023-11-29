package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户与角色对应关系(SysUserRole)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRole extends Model<SysUserRole> {
    
    private Long id;
    //用户ID
    private Long userId;
    //角色ID
    private Long roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}

