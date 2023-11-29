package com.n1c4n.domain;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 定时任务(ScheduleJob)表实体类
 *
 * @author makejava
 * @since 2023-11-28 14:27:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleJob extends Model<ScheduleJob> {
    //任务id
    private Long jobId;
    //spring bean名称
    private String beanName;
    //方法名
    private String methodName;
    //参数
    private String params;
    //cron表达式
    private String cronExpression;
    //任务状态  0：正常  1：暂停
    private Integer status;
    //备注
    private String remark;
    //创建时间
    private Date createTime;


    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

