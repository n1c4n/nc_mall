package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (ScoreLog)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreLog extends Model<ScoreLog> {
    //积分记录id
    private String id;
    //用户id
    private String userId;
    //0支出 1收入
    private Integer type;
    //记录创建时间
    private Date createTime;
    //流水号
    private String sn;
    //积分类型：1回收加积分 2购买减积分
    private Integer scoreType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getScoreType() {
        return scoreType;
    }

    public void setScoreType(Integer scoreType) {
        this.scoreType = scoreType;
    }
}

