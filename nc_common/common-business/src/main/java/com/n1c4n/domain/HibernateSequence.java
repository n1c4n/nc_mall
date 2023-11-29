package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (HibernateSequence)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HibernateSequence extends Model<HibernateSequence> {
    
    private Long nextVal;


    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }
}

