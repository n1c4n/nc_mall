package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 购物车(Basket)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:24:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Basket extends Model<Basket> {
    //主键
    private String basketId;
    //店铺ID
    private Long shopId;
    //产品ID
    private String prodId;
    //SkuID
    private String skuId;
    //用户ID
    private String openId;
    //购物车产品个数
    private Integer prodCount;
    //购物时间
    private Date createTime;


    public String getBasketId() {
        return basketId;
    }

    public void setBasketId(String basketId) {
        this.basketId = basketId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getProdCount() {
        return prodCount;
    }

    public void setProdCount(Integer prodCount) {
        this.prodCount = prodCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

