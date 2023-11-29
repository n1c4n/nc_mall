package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户表(Member)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member extends Model<Member> {
    //会员表的主键
    private Integer id;
    //ID
    private String openId;
    //用户昵称
    private String nickName;
    //真实姓名
    private String realName;
    //用户邮箱
    private String userMail;
    //支付密码
    private String payPassword;
    //手机号码
    private String userMobile;
    //修改时间
    private Date updateTime;
    //注册时间
    private Date createTime;
    //注册IP
    private String userRegip;
    //最后登录时间
    private Date userLasttime;
    //最后登录IP
    private String userLastip;
    //M(男) or F(女)
    private String sex;
    //例如：2009-11-27
    private String birthDate;
    //头像图片路径
    private String pic;
    //状态 1 正常 0 无效
    private Integer status;
    //用户积分
    private Integer score;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserRegip() {
        return userRegip;
    }

    public void setUserRegip(String userRegip) {
        this.userRegip = userRegip;
    }

    public Date getUserLasttime() {
        return userLasttime;
    }

    public void setUserLasttime(Date userLasttime) {
        this.userLasttime = userLasttime;
    }

    public String getUserLastip() {
        return userLastip;
    }

    public void setUserLastip(String userLastip) {
        this.userLastip = userLastip;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

