package com.javasm.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "prod_id", type = IdType.ASSIGN_ID)

    private Long prodId;

    @TableField(value = "category_id", whereStrategy = FieldStrategy.NOT_EMPTY)
    private Long categoryId;

    @TableField(value = "category_name", whereStrategy = FieldStrategy.NOT_EMPTY)
    private String categoryName;
    @TableField(value = "prod_code", condition = SqlCondition.LIKE, whereStrategy = FieldStrategy.NOT_EMPTY)
    private String prodCode;

    private Long brandId;

    @TableField(value = "brand_name", whereStrategy = FieldStrategy.NOT_EMPTY)
    private String brandName;
    @TableField(value = "prod_type", condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String prodType;

    @TableField(value = "prod_color", condition = SqlCondition.LIKE,whereStrategy = FieldStrategy.NOT_EMPTY)
    private String prodColor;

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", prodCode='" + prodCode + '\'' +
                ", brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", prodType='" + prodType + '\'' +
                ", prodColor='" + prodColor + '\'' +
                '}';
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }


    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdColor() {
        return prodColor;
    }

    public void setProdColor(String prodColor) {
        this.prodColor = prodColor;
    }

}
