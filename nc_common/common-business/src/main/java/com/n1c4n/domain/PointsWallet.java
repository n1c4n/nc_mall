package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (PointsWallet)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointsWallet extends Model<PointsWallet> {
    //积分钱包id
    private Long pointsWalletId;
    //积分Id
    private Long pointsId;
    //用户id
    private Long userId;
    //待结算积分
    private Object unsettled;
    //已结算积分
    private Object settled;
    //积累收益积分
    private Object addup;
    //乐观锁
    private Integer version;


    public Long getPointsWalletId() {
        return pointsWalletId;
    }

    public void setPointsWalletId(Long pointsWalletId) {
        this.pointsWalletId = pointsWalletId;
    }

    public Long getPointsId() {
        return pointsId;
    }

    public void setPointsId(Long pointsId) {
        this.pointsId = pointsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Object getUnsettled() {
        return unsettled;
    }

    public void setUnsettled(Object unsettled) {
        this.unsettled = unsettled;
    }

    public Object getSettled() {
        return settled;
    }

    public void setSettled(Object settled) {
        this.settled = settled;
    }

    public Object getAddup() {
        return addup;
    }

    public void setAddup(Object addup) {
        this.addup = addup;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}

