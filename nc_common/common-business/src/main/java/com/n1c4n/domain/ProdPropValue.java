package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (ProdPropValue)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdPropValue extends Model<ProdPropValue> {
    //属性值ID
    private Long valueId;
    //属性值名称
    private String propValue;
    //属性ID
    private Long propId;


    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    public Long getPropId() {
        return propId;
    }

    public void setPropId(Long propId) {
        this.propId = propId;
    }
}

