package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (CategoryBrand)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryBrand extends Model<CategoryBrand> {
    
    private Long id;
    //分类id
    private Long categoryId;
    //品牌id
    private Long brandId;


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

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}

