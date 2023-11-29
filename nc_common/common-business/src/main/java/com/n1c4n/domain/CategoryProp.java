package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (CategoryProp)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryProp extends Model<CategoryProp> {
    
    private Long id;
    //分类id
    private Long categoryId;
    //商品属性id即表prod_prop中的prop_id
    private Long propId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getPropId() {
        return propId;
    }

    public void setPropId(Long propId) {
        this.propId = propId;
    }
}

