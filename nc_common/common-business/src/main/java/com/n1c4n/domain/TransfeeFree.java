package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (TransfeeFree)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransfeeFree extends Model<TransfeeFree> {
    //指定条件包邮项id
    private Long transfeeFreeId;
    //运费模板id
    private Long transportId;
    //包邮方式 （0 满x件/重量/体积包邮 1满金额包邮 2满x件/重量/体积且满金额包邮）
    private Integer freeType;
    //需满金额
    private Double amount;
    //包邮x件/重量/体积
    private Double piece;


    public Long getTransfeeFreeId() {
        return transfeeFreeId;
    }

    public void setTransfeeFreeId(Long transfeeFreeId) {
        this.transfeeFreeId = transfeeFreeId;
    }

    public Long getTransportId() {
        return transportId;
    }

    public void setTransportId(Long transportId) {
        this.transportId = transportId;
    }

    public Integer getFreeType() {
        return freeType;
    }

    public void setFreeType(Integer freeType) {
        this.freeType = freeType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPiece() {
        return piece;
    }

    public void setPiece(Double piece) {
        this.piece = piece;
    }
}

