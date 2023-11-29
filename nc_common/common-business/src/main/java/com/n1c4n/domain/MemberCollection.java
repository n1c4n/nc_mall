package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (MemberCollection)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberCollection extends Model<MemberCollection> {
    //收藏表
    private Long id;
    //商品id
    private Long prodId;
    //用户id
    private String openId;
    //收藏时间
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

