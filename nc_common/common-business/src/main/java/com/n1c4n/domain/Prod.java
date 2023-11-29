package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 商品(Prod)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prod extends Model<Prod> {
    //产品ID
    private String prodId;
    //商品名称
    private String prodName;
    //店铺id
    private Long shopId;
    //原价
    private Double oriPrice;
    //现价
    private Double price;
    //简要描述,卖点等
    private String brief;
    //详细描述
    private String content;
    //商品主图
    private String pic;
    //商品图片，以,分割
    private String imgs;
    //默认是1，表示正常状态, -1表示删除, 0下架
    private Integer status;
    //商品分类
    private String categoryId;
    //销量
    private Integer soldNum;
    //总库存
    private Integer totalStocks;
    //配送方式json见TransportModeVO
    private Object deliveryMode;
    //运费模板id
    private Long deliveryTemplateId;
    //录入时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //上架时间
    private Date putawayTime;
    //版本 乐观锁
    private Integer version;


    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(Integer totalStocks) {
        this.totalStocks = totalStocks;
    }

    public Object getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(Object deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public Long getDeliveryTemplateId() {
        return deliveryTemplateId;
    }

    public void setDeliveryTemplateId(Long deliveryTemplateId) {
        this.deliveryTemplateId = deliveryTemplateId;
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

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}

