package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 订单项(OrderItem)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends Model<OrderItem> {
    //订单项ID
    private String orderItemId;
    //店铺id
    private Long shopId;
    //订单order_number
    private String orderNumber;
    //产品ID
    private String prodId;
    //产品SkuID
    private String skuId;
    //购物车产品个数
    private Integer prodCount;
    //产品名称
    private String prodName;
    //sku名称
    private String skuName;
    //产品主图片路径
    private String pic;
    //产品价格
    private Double price;
    //商品总金额
    private Double productTotalAmount;
    //购物时间
    private Date createTime;
    //评论状态： 0 未评价  1 已评价
    private Integer commSts;


    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public Integer getProdCount() {
        return prodCount;
    }

    public void setProdCount(Integer prodCount) {
        this.prodCount = prodCount;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getProductTotalAmount() {
        return productTotalAmount;
    }

    public void setProductTotalAmount(Double productTotalAmount) {
        this.productTotalAmount = productTotalAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCommSts() {
        return commSts;
    }

    public void setCommSts(Integer commSts) {
        this.commSts = commSts;
    }
}

