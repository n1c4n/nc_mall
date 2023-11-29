package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 短信记录表(SmsLog)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsLog extends Model<SmsLog> {
    //ID
    private String id;
    //用户id
    private String openId;
    //手机号码
    private String userPhone;
    //短信模板
    private String templateId;
    //手机验证码
    private String mobileCode;
    //发送时间
    private Date createTime;
    //发送短信返回码
    private String responseCode;
    //状态  1:有效  0：失效
    private Integer status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

