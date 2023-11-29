package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (PointsChange)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointsChange extends Model<PointsChange> {
    //积分流动记录表
    private Long pointsChangeId;
    //积分钱包id
    private Long pointsWalletId;
    //增加或减少(增加 0 减少 1)
    private Integer addOrReduce;
    //原因(订单，邀请，签到，兑换)
    private Integer reason;
    //积分状态（0:用户未收货待结算，1:已结算 2:用户退货退单）
    private Integer state;
    //积分数额
    private Object pointsNumber;
    //关联订单id
    private Long orderId;
    //商户订单id
    private Long merchantOrderId;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;


    public Long getPointsChangeId() {
        return pointsChangeId;
    }

    public void setPointsChangeId(Long pointsChangeId) {
        this.pointsChangeId = pointsChangeId;
    }

    public Long getPointsWalletId() {
        return pointsWalletId;
    }

    public void setPointsWalletId(Long pointsWalletId) {
        this.pointsWalletId = pointsWalletId;
    }

    public Integer getAddOrReduce() {
        return addOrReduce;
    }

    public void setAddOrReduce(Integer addOrReduce) {
        this.addOrReduce = addOrReduce;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getPointsNumber() {
        return pointsNumber;
    }

    public void setPointsNumber(Object pointsNumber) {
        this.pointsNumber = pointsNumber;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(Long merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
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

