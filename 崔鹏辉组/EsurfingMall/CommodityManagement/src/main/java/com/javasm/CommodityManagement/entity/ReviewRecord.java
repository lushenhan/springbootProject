package com.javasm.CommodityManagement.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class ReviewRecord implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "record_id",type=IdType.ASSIGN_ID)

    private Integer recordId;


    private String requisitionId;


    private String reviewerId;


    private String reviewerName;


    private String reviewTime;


    private String reviewStatus;


    private String reviewOpinion;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }
    public String getRequisitionId() {
        return requisitionId;
    }

    public void setRequisitionId(String requisitionId) {
        this.requisitionId = requisitionId;
    }
    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }
    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }
    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }
    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
    public String getReviewOpinion() {
        return reviewOpinion;
    }

    public void setReviewOpinion(String reviewOpinion) {
        this.reviewOpinion = reviewOpinion;
    }

    @Override
    public String toString() {
        return "ReviewRecord{" +
            "recordId=" + recordId +
            ", requisitionId=" + requisitionId +
            ", reviewerId=" + reviewerId +
            ", reviewerName=" + reviewerName +
            ", reviewTime=" + reviewTime +
            ", reviewStatus=" + reviewStatus +
            ", reviewOpinion=" + reviewOpinion +
        "}";
    }
}
