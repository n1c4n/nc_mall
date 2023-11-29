package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (Transport)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transport extends Model<Transport> {
    //运费模板id
    private Long transportId;
    //运费模板名称
    private String transName;
    //创建时间
    private Date createTime;
    //店铺id
    private Long shopId;
    //收费方式（0 按件数,1 按重量 2 按体积）
    private Integer chargeType;
    //是否包邮 0:不包邮 1:包邮
    private Integer isFreeFee;
    //是否含有包邮条件 0 否 1是
    private Integer hasFreeCondition;


    public Long getTransportId() {
        return transportId;
    }

    public void setTransportId(Long transportId) {
        this.transportId = transportId;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getIsFreeFee() {
        return isFreeFee;
    }

    public void setIsFreeFee(Integer isFreeFee) {
        this.isFreeFee = isFreeFee;
    }

    public Integer getHasFreeCondition() {
        return hasFreeCondition;
    }

    public void setHasFreeCondition(Integer hasFreeCondition) {
        this.hasFreeCondition = hasFreeCondition;
    }
}

