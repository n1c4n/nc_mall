package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 商品收藏表(ProdFavorite)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdFavorite extends Model<ProdFavorite> {
    //主键
    private String favoriteId;
    //商品ID
    private String prodId;
    //收藏时间
    private Date recTime;
    //用户ID
    private String userId;


    public String getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(String favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

