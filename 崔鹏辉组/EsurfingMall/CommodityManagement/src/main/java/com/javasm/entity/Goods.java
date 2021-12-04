package com.javasm.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;

public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "goods_id", type = IdType.ASSIGN_ID)

    private Long goodsId;


    private String goodsCode;
    @TableField(value = "goods_name", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)

    private String goodsName;

    @TableField(value = "category_id", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String categoryId;

    @TableField(value = "category_name", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String categoryName;

    @TableField(value = "brand_id", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String brandId;
    @TableField(value = "level", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private Integer level;
    @TableField(value = "brand_name", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String brandName;

    @TableField(value = "type", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String type;

    @TableField(value = "color", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String color;

    private BigDecimal purchasePrice;
    private BigDecimal marketPrice;
    private BigDecimal mallPrice;
    private Integer purchaseStatus;
    @TableField(value = "min_num", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private Integer minNum;

    @TableField(value = "supplier_id", whereStrategy = FieldStrategy.NOT_EMPTY)
    private Long supplierId;

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }


    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(BigDecimal mallPrice) {
        this.mallPrice = mallPrice;
    }

    public Integer getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(Integer purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", brandId='" + brandId + '\'' +
                ", level=" + level +
                ", brandName='" + brandName + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", marketPrice=" + marketPrice +
                ", mallPrice=" + mallPrice +
                ", purchaseStatus=" + purchaseStatus +
                ", minNum=" + minNum +
                ", supplierId=" + supplierId +
                '}';
    }

}
