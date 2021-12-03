package com.javasm.entity;
import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "goods_id",type=IdType.ASSIGN_ID)

    private Long goodsId;

    @TableField(value = "goods_name",condition = SqlCondition.LIKE)

    private String goodsName;


    private String categoryId;


    private String categoryName;


    private String brandId;

    private Integer level;

    private String brandName;

    @TableField(value = "type",condition = SqlCondition.LIKE)
    private String type;


    private String color;
    private BigDecimal purchasePrice;
    private BigDecimal marketPrice;
    private BigDecimal mallPrice;
    private Integer purchaseStatus;

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", brandId='" + brandId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", marketPrice=" + marketPrice +
                ", mallPrice=" + mallPrice +
                ", purchaseStatus=" + purchaseStatus +
                '}';
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

}
