package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 系统用户(SysUser)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends Model<SysUser> {
    
    private Long userId;
    //用户名
    private String username;
    //密码
    private String password;
    //邮箱
    private String email;
    //手机号
    private String mobile;
    //状态  0：禁用   1：正常
    private Integer status;
    //创建者ID
    private Long createUserId;
    //创建时间
    private Date createTime;
    //用户所在的商城Id
    private Long shopId;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}

