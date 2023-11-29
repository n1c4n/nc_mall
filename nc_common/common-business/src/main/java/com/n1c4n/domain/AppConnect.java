package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (AppConnect)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppConnect extends Model<AppConnect> {
    //id
    private String id;
    //本系统userId
    private String userId;
    //第三方系统id 1：微信小程序
    private Integer appId;
    //第三方系统昵称
    private String nickName;
    //第三方系统头像
    private String imageUrl;
    //第三方系统userid
    private String bizUserId;
    //第三方系统unionid
    private String bizUnionid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBizUserId() {
        return bizUserId;
    }

    public void setBizUserId(String bizUserId) {
        this.bizUserId = bizUserId;
    }

    public String getBizUnionid() {
        return bizUnionid;
    }

    public void setBizUnionid(String bizUnionid) {
        this.bizUnionid = bizUnionid;
    }
}

