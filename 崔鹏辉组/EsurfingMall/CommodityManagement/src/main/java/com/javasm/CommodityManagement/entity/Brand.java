package com.javasm.CommodityManagement.entity;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "brand_id",type=IdType.ASSIGN_ID)

    private Long brandId;


    private String brandName;


    private String brandUrl;


    private String description;

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
    public String getBrandUrl() {
        return brandUrl;
    }

    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Brand{" +
            "brandId=" + brandId +
            ", brandName=" + brandName +
            ", brandUrl=" + brandUrl +
            ", description=" + description +
        "}";
    }
}
