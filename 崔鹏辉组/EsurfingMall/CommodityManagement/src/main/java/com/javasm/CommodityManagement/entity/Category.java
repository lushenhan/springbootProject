package com.javasm.CommodityManagement.entity;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "category_id",type=IdType.ASSIGN_ID)
    private Long categoryId;


    private String categoryName;


    private String brandId;


    private Integer level;

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
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Category{" +
            "categoryId=" + categoryId +
            ", categoryName=" + categoryName +
            ", brandId=" + brandId +
            ", level=" + level +
        "}";
    }
}
