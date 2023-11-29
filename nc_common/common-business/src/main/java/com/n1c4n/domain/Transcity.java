package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (Transcity)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transcity extends Model<Transcity> {
    
    private Long transcityId;
    //运费项id
    private Long transfeeId;
    //城市id
    private Long cityId;


    public Long getTranscityId() {
        return transcityId;
    }

    public void setTranscityId(Long transcityId) {
        this.transcityId = transcityId;
    }

    public Long getTransfeeId() {
        return transfeeId;
    }

    public void setTransfeeId(Long transfeeId) {
        this.transfeeId = transfeeId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}

