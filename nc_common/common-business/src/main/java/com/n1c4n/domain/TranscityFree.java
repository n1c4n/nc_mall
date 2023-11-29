package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (TranscityFree)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranscityFree extends Model<TranscityFree> {
    //指定条件包邮城市项id
    private Long transcityFreeId;
    //指定条件包邮项id
    private Long transfeeFreeId;
    //城市id
    private Long freeCityId;


    public Long getTranscityFreeId() {
        return transcityFreeId;
    }

    public void setTranscityFreeId(Long transcityFreeId) {
        this.transcityFreeId = transcityFreeId;
    }

    public Long getTransfeeFreeId() {
        return transfeeFreeId;
    }

    public void setTransfeeFreeId(Long transfeeFreeId) {
        this.transfeeFreeId = transfeeFreeId;
    }

    public Long getFreeCityId() {
        return freeCityId;
    }

    public void setFreeCityId(Long freeCityId) {
        this.freeCityId = freeCityId;
    }
}

