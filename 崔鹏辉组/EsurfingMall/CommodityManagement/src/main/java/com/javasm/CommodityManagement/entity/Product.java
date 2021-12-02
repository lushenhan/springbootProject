package com.javasm.CommodityManagement.entity;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "prod_id",type=IdType.ASSIGN_ID)

    private Long prodId;


    private Long categoryId;


    private String categoryName;


    private Long brandId;


    private String brandName;

    @TableField(value="prod_type",condition = SqlCondition.LIKE)
    private String prodType;


    private String prodColor;

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

    @Override
    public String toString() {
        return "Product{" +
            "prodId=" + prodId +
            ", categoryId=" + categoryId +
            ", categoryName=" + categoryName +
            ", brandId=" + brandId +
            ", brandName=" + brandName +
            ", prodType=" + prodType +
            ", prodColor=" + prodColor +
        "}";
    }
}
