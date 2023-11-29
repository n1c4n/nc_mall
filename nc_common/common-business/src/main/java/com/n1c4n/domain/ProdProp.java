package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (ProdProp)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdProp extends Model<ProdProp> {
    //属性id
    private Long propId;
    //属性名称
    private String propName;
    //ProdPropRule 1:销售属性(规格); 2:参数属性;
    private Integer rule;
    //店铺id
    private Long shopId;


    public Long getPropId() {
        return propId;
    }

    public void setPropId(Long propId) {
        this.propId = propId;
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public Integer getRule() {
        return rule;
    }

    public void setRule(Integer rule) {
        this.rule = rule;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}

