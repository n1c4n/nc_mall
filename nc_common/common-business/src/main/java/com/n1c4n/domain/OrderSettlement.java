package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (OrderSettlement)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderSettlement extends Model<OrderSettlement> {
    //支付结算单据ID
    private String settlementId;
    //外部订单流水号
    private String bizPayNo;
    //order表中的订单号
    private String orderNumber;
    //支付方式 1 支付宝 2 微信
    private Integer payType;
    //支付金额
    private Double payAmount;
    //是否清算 0:否 1:是
    private Integer isClearing;
    //创建时间
    private Date createTime;
    //清算时间
    private Date clearingTime;
    //版本号
    private Integer version;
    //支付状态
    private Integer payStatus;


    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    public String getBizPayNo() {
        return bizPayNo;
    }

    public void setBizPayNo(String bizPayNo) {
        this.bizPayNo = bizPayNo;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getIsClearing() {
        return isClearing;
    }

    public void setIsClearing(Integer isClearing) {
        this.isClearing = isClearing;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getClearingTime() {
        return clearingTime;
    }

    public void setClearingTime(Date clearingTime) {
        this.clearingTime = clearingTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }
}

