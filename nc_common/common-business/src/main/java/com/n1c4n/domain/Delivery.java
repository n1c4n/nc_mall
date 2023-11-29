package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 物流公司(Delivery)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Delivery extends Model<Delivery> {
    //ID
    private String dvyId;
    //物流公司名称
    private String dvyName;
    //公司主页
    private String companyHomeUrl;
    //建立时间
    private Date recTime;
    //修改时间
    private Date modifyTime;
    //物流查询接口
    private String queryUrl;


    public String getDvyId() {
        return dvyId;
    }

    public void setDvyId(String dvyId) {
        this.dvyId = dvyId;
    }

    public String getDvyName() {
        return dvyName;
    }

    public void setDvyName(String dvyName) {
        this.dvyName = dvyName;
    }

    public String getCompanyHomeUrl() {
        return companyHomeUrl;
    }

    public void setCompanyHomeUrl(String companyHomeUrl) {
        this.companyHomeUrl = companyHomeUrl;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getQueryUrl() {
        return queryUrl;
    }

    public void setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl;
    }
}

