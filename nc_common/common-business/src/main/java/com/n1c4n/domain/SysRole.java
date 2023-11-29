package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 角色(SysRole)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRole extends Model<SysRole> {
    
    private Long roleId;
    //角色名称
    private String roleName;
    //备注
    private String remark;
    //创建者ID
    private Long createUserId;
    //创建时间
    private Date createTime;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

