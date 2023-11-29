package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (Transfee)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transfee extends Model<Transfee> {
    //运费项id
    private Long transfeeId;
    //运费模板id
    private Long transportId;
    //续件数量
    private Double continuousPiece;
    //首件数量
    private Double firstPiece;
    //续件费用
    private Double continuousFee;
    //首件费用
    private Double firstFee;


    public Long getTransfeeId() {
        return transfeeId;
    }

    public void setTransfeeId(Long transfeeId) {
        this.transfeeId = transfeeId;
    }

    public Long getTransportId() {
        return transportId;
    }

    public void setTransportId(Long transportId) {
        this.transportId = transportId;
    }

    public Double getContinuousPiece() {
        return continuousPiece;
    }

    public void setContinuousPiece(Double continuousPiece) {
        this.continuousPiece = continuousPiece;
    }

    public Double getFirstPiece() {
        return firstPiece;
    }

    public void setFirstPiece(Double firstPiece) {
        this.firstPiece = firstPiece;
    }

    public Double getContinuousFee() {
        return continuousFee;
    }

    public void setContinuousFee(Double continuousFee) {
        this.continuousFee = continuousFee;
    }

    public Double getFirstFee() {
        return firstFee;
    }

    public void setFirstFee(Double firstFee) {
        this.firstFee = firstFee;
    }
}

