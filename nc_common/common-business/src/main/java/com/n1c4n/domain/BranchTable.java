package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (BranchTable)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:24:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchTable extends Model<BranchTable> {
    //分支事务ID
    private Long branchId;
    //全局事务ID
    private String xid;
    //全局事务ID，不带TC地址
    private Long transactionId;
    //资源分组ID
    private String resourceGroupId;
    //资源ID
    private String resourceId;
    //事务模式，AT、XA等
    private String branchType;
    //状态
    private Integer status;
    //客户端ID
    private String clientId;
    //应用数据
    private String applicationData;
    //创建时间
    private Object gmtCreate;
    //修改时间
    private Object gmtModified;


    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

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

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getBranchType() {
        return branchType;
    }

    public void setBranchType(String branchType) {
        this.branchType = branchType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getApplicationData() {
        return applicationData;
    }

    public void setApplicationData(String applicationData) {
        this.applicationData = applicationData;
    }

    public Object getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Object gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Object getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Object gmtModified) {
        this.gmtModified = gmtModified;
    }
}

