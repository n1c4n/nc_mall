package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 商品评论(ProdComm)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdComm extends Model<ProdComm> {
    //ID
    private String prodCommId;
    //商品ID
    private String prodId;
    //商品的名字
    private String prodName;
    //订单项ID
    private String orderItemId;
    //评论用户ID
    private String openId;
    //评论内容
    private String content;
    //掌柜回复
    private String replyContent;
    //记录时间
    private Date createTime;
    //回复时间
    private Date replyTime;
    //是否回复 0:未回复  1:已回复
    private Integer replySts;
    //IP来源
    private String postip;
    //得分，0-5分
    private Integer score;
    //有用的计数
    private Integer usefulCounts;
    //晒图的json字符串
    private String pics;
    //是否匿名(1:是  0:否)
    private Integer isAnonymous;
    //是否显示，1:为显示，0:待审核， -1：不通过审核，不显示。 如果需要审核评论，则是0,，否则1
    private Integer status;
    //评价(0好评 1中评 2差评)
    private Integer evaluate;
    //店铺
    private Long shopId;


    public String getProdCommId() {
        return prodCommId;
    }

    public void setProdCommId(String prodCommId) {
        this.prodCommId = prodCommId;
    }

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

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getReplySts() {
        return replySts;
    }

    public void setReplySts(Integer replySts) {
        this.replySts = replySts;
    }

    public String getPostip() {
        return postip;
    }

    public void setPostip(String postip) {
        this.postip = postip;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getUsefulCounts() {
        return usefulCounts;
    }

    public void setUsefulCounts(Integer usefulCounts) {
        this.usefulCounts = usefulCounts;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Integer evaluate) {
        this.evaluate = evaluate;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}

