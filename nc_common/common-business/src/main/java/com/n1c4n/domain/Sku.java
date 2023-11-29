package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 单品SKU表(Sku)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sku extends Model<Sku> {
    //单品ID
    private String skuId;
    //商品ID
    private String prodId;
    //销售属性组合字符串 格式是p1:v1;p2:v2
    private String properties;
    //原价
    private Double oriPrice;
    //价格
    private Double price;
    //商品在付款减库存的状态下，该sku上未付款的订单数量
    private Integer stocks;
    //实际库存
    private Integer actualStocks;
    //修改时间
    private Date updateTime;
    //记录时间
    private Date createTime;
    //商品条形码
    private String modelId;
    //sku图片
    private String pic;
    //sku名称
    private String skuName;
    //商品名称
    private String prodName;
    //版本号
    private Integer version;
    //商品重量
    private Object weight;
    //商品体积
    private Object volume;
    //0 禁用 1 启用
    private Integer status;


    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Double getOriPrice() {
        return oriPrice;
    }

    public void setOriPrice(Double oriPrice) {
        this.oriPrice = oriPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }

    public Integer getActualStocks() {
        return actualStocks;
    }

    public void setActualStocks(Integer actualStocks) {
        this.actualStocks = actualStocks;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public Object getVolume() {
        return volume;
    }

    public void setVolume(Object volume) {
        this.volume = volume;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

