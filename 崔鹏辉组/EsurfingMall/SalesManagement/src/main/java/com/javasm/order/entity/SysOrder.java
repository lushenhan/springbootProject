package com.javasm.order.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;

public class SysOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单串码
     */

    @TableId(value = "order_code",type=IdType.ASSIGN_ID)

    private Long orderCode;

    /**
     * 订单类型
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String orderType;

    /**
     * 订单动作
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String orderAct;

    /**
     * 业务类型
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String serviceType;

    /**
     * 支付方式
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String payBy;

    /**
     * 配送方式
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String sendBy;

    /**
     * 订单状态
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String orderStatus;

    /**
     * 订单创建时间
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY , fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 订单更新时间
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY , fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 汇款人
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private String remitter;

    /**
     * 收货人资料
     */
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    private Integer recipientId;

    /**
     * 备注
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String orderRemark;

    public Long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Long orderCode) {
        this.orderCode = orderCode;
    }
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public String getOrderAct() {
        return orderAct;
    }

    public void setOrderAct(String orderAct) {
        this.orderAct = orderAct;
    }
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public String getPayBy() {
        return payBy;
    }

    public void setPayBy(String payBy) {
        this.payBy = payBy;
    }
    public String getSendBy() {
        return sendBy;
    }

    public void setSendBy(String sendBy) {
        this.sendBy = sendBy;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public String getRemitter() {
        return remitter;
    }

    public void setRemitter(String remitter) {
        this.remitter = remitter;
    }
    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }
    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    @Override
    public String toString() {
        return "SysOrder{" +
            "orderCode=" + orderCode +
            ", orderType=" + orderType +
            ", orderAct=" + orderAct +
            ", serviceType=" + serviceType +
            ", payBy=" + payBy +
            ", sendBy=" + sendBy +
            ", orderStatus=" + orderStatus +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", remitter=" + remitter +
            ", recipientId=" + recipientId +
            ", orderRemark=" + orderRemark +
        "}";
    }
}
