package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (GlobalTable)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalTable extends Model<GlobalTable> {
    //全局事务ID
    private String xid;
    //事务ID
    private Long transactionId;
    //状态
    private Integer status;
    //应用ID
    private String applicationId;
    //事务分组名
    private String transactionServiceGroup;
    //执行事务的方法
    private String transactionName;
    //超时时间
    private Integer timeout;
    //开始时间
    private Long beginTime;
    //应用数据
    private String applicationData;
    //创建时间
    private Date gmtCreate;
    //修改时间
    private Date gmtModified;


    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getTransactionServiceGroup() {
        return transactionServiceGroup;
    }

    public void setTransactionServiceGroup(String transactionServiceGroup) {
        this.transactionServiceGroup = transactionServiceGroup;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public String getApplicationData() {
        return applicationData;
    }

    public void setApplicationData(String applicationData) {
        this.applicationData = applicationData;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}

