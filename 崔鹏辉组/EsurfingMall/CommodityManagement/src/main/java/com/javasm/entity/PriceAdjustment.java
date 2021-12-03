package com.javasm.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class PriceAdjustment implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "requisition_id",type=IdType.ASSIGN_ID)

    private Long requisitionId;


    private Long prodId;


    private String prodName;


    private BigDecimal originalMarketPrice;


    private BigDecimal currentMarketPrice;


    private BigDecimal originalMallPrice;


    private BigDecimal currentMallPrice;


    private LocalDateTime effectiveTime;


    private LocalDateTime invalidTime;


    private Integer approveStatus;


    private String cause;


    private Integer amount;


    private String remark;


    private Long submitterId;

    public Long getRequisitionId() {
        return requisitionId;
    }

    public void setRequisitionId(Long requisitionId) {
        this.requisitionId = requisitionId;
    }
    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public BigDecimal getOriginalMarketPrice() {
        return originalMarketPrice;
    }

    public void setOriginalMarketPrice(BigDecimal originalMarketPrice) {
        this.originalMarketPrice = originalMarketPrice;
    }
    public BigDecimal getCurrentMarketPrice() {
        return currentMarketPrice;
    }

    public void setCurrentMarketPrice(BigDecimal currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
    }
    public BigDecimal getOriginalMallPrice() {
        return originalMallPrice;
    }

    public void setOriginalMallPrice(BigDecimal originalMallPrice) {
        this.originalMallPrice = originalMallPrice;
    }
    public BigDecimal getCurrentMallPrice() {
        return currentMallPrice;
    }

    public void setCurrentMallPrice(BigDecimal currentMallPrice) {
        this.currentMallPrice = currentMallPrice;
    }
    public LocalDateTime getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(LocalDateTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
    public LocalDateTime getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(LocalDateTime invalidTime) {
        this.invalidTime = invalidTime;
    }
    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Long getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(Long submitterId) {
        this.submitterId = submitterId;
    }

    @Override
    public String toString() {
        return "PriceAdjustment{" +
            "requisitionId=" + requisitionId +
            ", prodId=" + prodId +
            ", prodName=" + prodName +
            ", originalMarketPrice=" + originalMarketPrice +
            ", currentMarketPrice=" + currentMarketPrice +
            ", originalMallPrice=" + originalMallPrice +
            ", currentMallPrice=" + currentMallPrice +
            ", effectiveTime=" + effectiveTime +
            ", invalidTime=" + invalidTime +
            ", approveStatus=" + approveStatus +
            ", cause=" + cause +
            ", amount=" + amount +
            ", remark=" + remark +
            ", submitterId=" + submitterId +
        "}";
    }
}
