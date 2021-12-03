package com.javasm.gift.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;


public class Gift implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 赠品id
     */

    @TableId(value = "gift_id", type = IdType.AUTO)
    private Long giftId;

    @TableField(condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String giftName;
    @TableField(condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String giftType;
    @TableField(condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String giftModel;

    private String giftRice;



    private String giftCost;

    private String giftEpm;


    private String giftMinstock;

    @TableField(condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String giftColour;

    @TableField(condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String giftBrand;


    private String giftState;


    private LocalDateTime creatTime;


    private LocalDateTime updateTime;

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }
    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }
    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String giftType) {
        this.giftType = giftType;
    }
    public String getGiftModel() {
        return giftModel;
    }

    public void setGiftModel(String giftModel) {
        this.giftModel = giftModel;
    }
    public String getGiftRice() {
        return giftRice;
    }

    public void setGiftRice(String giftRice) {
        this.giftRice = giftRice;
    }
    public String getGiftCost() {
        return giftCost;
    }

    public void setGiftCost(String giftCost) {
        this.giftCost = giftCost;
    }
    public String getGiftEpm() {
        return giftEpm;
    }

    public void setGiftEpm(String giftEpm) {
        this.giftEpm = giftEpm;
    }
    public String getGiftMinstock() {
        return giftMinstock;
    }

    public void setGiftMinstock(String giftMinstock) {
        this.giftMinstock = giftMinstock;
    }
    public String getGiftColour() {
        return giftColour;
    }

    public void setGiftColour(String giftColour) {
        this.giftColour = giftColour;
    }
    public String getGiftBrand() {
        return giftBrand;
    }

    public void setGiftBrand(String giftBrand) {
        this.giftBrand = giftBrand;
    }
    public String getGiftState() {
        return giftState;
    }

    public void setGiftState(String giftState) {
        this.giftState = giftState;
    }
    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Gift{" +
            "giftId=" + giftId +
            ", giftName=" + giftName +
            ", giftType=" + giftType +
            ", giftModel=" + giftModel +
            ", giftRice=" + giftRice +
            ", giftCost=" + giftCost +
            ", giftEpm=" + giftEpm +
            ", giftMinstock=" + giftMinstock +
            ", giftColour=" + giftColour +
            ", giftBrand=" + giftBrand +
            ", giftState=" + giftState +
            ", creatTime=" + creatTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
