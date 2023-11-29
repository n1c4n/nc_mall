package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 订单表(Order)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends Model<Order> {
    //订单ID
    private String orderId;
    //订购用户ID
    private String openId;
    //订购流水号
    private String orderNumber;
    //总值
    private Double totalMoney;
    //实际总值
    private Double actualTotal;
    //订单备注
    private String remarks;
    //订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:成功 6:失败
    private Integer status;
    //配送类型
    private String dvyType;
    //配送方式ID
    private Long dvyId;
    //物流单号
    private String dvyFlowId;
    //订单运费
    private Double freightAmount;
    //用户订单地址Id
    private Long addrOrderId;
    //订单商品总数
    private Integer productNums;
    //订购时间
    private Date createTime;
    //订单更新时间
    private Date updateTime;
    //付款时间
    private Date payTime;
    //发货时间
    private Date dvyTime;
    //完成时间
    private Date finallyTime;
    //取消时间
    private Date cancelTime;
    //是否已经支付，1：已经支付过，0：，没有支付过
    private Integer isPayed;
    //用户订单删除状态，0：没有删除， 1：回收站， 2：永久删除
    private Integer deleteStatus;
    //0:默认,1:在处理,2:处理完成
    private Integer refundSts;
    //优惠总额
    private Double reduceAmount;
    //订单关闭原因 1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
    private Integer closeType;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Double getActualTotal() {
        return actualTotal;
    }

    public void setActualTotal(Double actualTotal) {
        this.actualTotal = actualTotal;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDvyType() {
        return dvyType;
    }

    public void setDvyType(String dvyType) {
        this.dvyType = dvyType;
    }

    public Long getDvyId() {
        return dvyId;
    }

    public void setDvyId(Long dvyId) {
        this.dvyId = dvyId;
    }

    public String getDvyFlowId() {
        return dvyFlowId;
    }

    public void setDvyFlowId(String dvyFlowId) {
        this.dvyFlowId = dvyFlowId;
    }

    public Double getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(Double freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Long getAddrOrderId() {
        return addrOrderId;
    }

    public void setAddrOrderId(Long addrOrderId) {
        this.addrOrderId = addrOrderId;
    }

    public Integer getProductNums() {
        return productNums;
    }

    public void setProductNums(Integer productNums) {
        this.productNums = productNums;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDvyTime() {
        return dvyTime;
    }

    public void setDvyTime(Date dvyTime) {
        this.dvyTime = dvyTime;
    }

    public Date getFinallyTime() {
        return finallyTime;
    }

    public void setFinallyTime(Date finallyTime) {
        this.finallyTime = finallyTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(Integer isPayed) {
        this.isPayed = isPayed;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getRefundSts() {
        return refundSts;
    }

    public void setRefundSts(Integer refundSts) {
        this.refundSts = refundSts;
    }

    public Double getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(Double reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public Integer getCloseType() {
        return closeType;
    }

    public void setCloseType(Integer closeType) {
        this.closeType = closeType;
    }
}

