package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 热搜(HotSearch)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotSearch extends Model<HotSearch> {
    //主键
    private String hotSearchId;
    //店铺ID 0为全局热搜
    private Long shopId;
    //内容
    private String content;
    //录入时间
    private Date createTime;
    //顺序
    private Integer seq;
    //状态 0下线 1上线
    private Integer status;
    //热搜标题
    private String title;


    public String getHotSearchId() {
        return hotSearchId;
    }

    public void setHotSearchId(String hotSearchId) {
        this.hotSearchId = hotSearchId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

