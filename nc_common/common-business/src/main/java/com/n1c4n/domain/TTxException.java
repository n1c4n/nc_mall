package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (TTxException)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TTxException extends Model<TTxException> {
    
    private Long id;
    
    private Date createTime;
    
    private Integer exState;
    
    private String groupId;
    
    private String modId;
    
    private Integer registrar;
    
    private String remark;
    
    private Integer transactionState;
    
    private String unitId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getExState() {
        return exState;
    }

    public void setExState(Integer exState) {
        this.exState = exState;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }

    public Integer getRegistrar() {
        return registrar;
    }

    public void setRegistrar(Integer registrar) {
        this.registrar = registrar;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(Integer transactionState) {
        this.transactionState = transactionState;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }
}

