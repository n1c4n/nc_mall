package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (PointsProd)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointsProd extends Model<PointsProd> {
    //积分商品id
    private Long pointsProdId;
    //所需积分id
    private Long pointsId;
    //所需积分量
    private Object pointsNumber;
    //所需金额
    private Double amount;
    //关联商品id
    private Long prodId;
    //库存
    private Integer stocks;
    //状态(0下架 1上架)
    private Integer state;
    //上架时间
    private Date upperShelfTime;
    //下架时间
    private Date lowerShelf;


    public Long getPointsProdId() {
        return pointsProdId;
    }

    public void setPointsProdId(Long pointsProdId) {
        this.pointsProdId = pointsProdId;
    }

    public Long getPointsId() {
        return pointsId;
    }

    public void setPointsId(Long pointsId) {
        this.pointsId = pointsId;
    }

    public Object getPointsNumber() {
        return pointsNumber;
    }

    public void setPointsNumber(Object pointsNumber) {
        this.pointsNumber = pointsNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpperShelfTime() {
        return upperShelfTime;
    }

    public void setUpperShelfTime(Date upperShelfTime) {
        this.upperShelfTime = upperShelfTime;
    }

    public Date getLowerShelf() {
        return lowerShelf;
    }

    public void setLowerShelf(Date lowerShelf) {
        this.lowerShelf = lowerShelf;
    }
}

