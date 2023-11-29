package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 商品分组表(ProdTag)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdTag extends Model<ProdTag> {
    //分组标签id
    private Long id;
    //分组标题
    private String title;
    //状态(1为正常,0为删除)
    private Integer status;
    //列表样式(0:一列一个,1:一列两个,2:一列三个)
    private Integer style;
    //排序
    private Integer seq;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
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

