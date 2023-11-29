package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户配送地址(MemberAddr)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberAddr extends Model<MemberAddr> {
    //ID
    private String addrId;
    //用户ID
    private String openId;
    //收货人
    private String receiver;
    //省ID
    private Long provinceId;
    //省
    private String province;
    //城市
    private String city;
    //城市ID
    private Long cityId;
    //区
    private String area;
    //区ID
    private Long areaId;
    //邮编
    private String postCode;
    //地址
    private String addr;
    //手机
    private String mobile;
    //状态,1正常，0无效
    private Integer status;
    //是否默认地址 1是
    private Integer commonAddr;
    //建立时间
    private Date createTime;
    //更新时间
    private Date updateTime;


    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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

    public Integer getCommonAddr() {
        return commonAddr;
    }

    public void setCommonAddr(Integer commonAddr) {
        this.commonAddr = commonAddr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

