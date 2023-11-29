package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 角色与菜单对应关系(SysRoleMenu)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleMenu extends Model<SysRoleMenu> {
    
    private Long id;
    //角色ID
    private Long roleId;
    //菜单ID
    private Long menuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}

