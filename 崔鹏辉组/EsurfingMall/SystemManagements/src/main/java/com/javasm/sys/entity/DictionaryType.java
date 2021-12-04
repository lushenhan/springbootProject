package com.javasm.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class DictionaryType implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "dict_Type_Id", type = IdType.AUTO)

    private Long dictTypeId;

    /**
     * 字典名称
     */

    private String dictName;


    private String dictLevel;


    private String dictType;


    private LocalDateTime createTime;


    private LocalDateTime updateTime;

    public Long getDictTypeId() {
        return dictTypeId;
    }

    public void setDictTypeId(Long dictTypeId) {
        this.dictTypeId = dictTypeId;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictLevel() {
        return dictLevel;
    }

    public void setDictLevel(String dictLevel) {
        this.dictLevel = dictLevel;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
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

    @Override
    public String toString() {
        return "DictionaryType{" +
                "dictTypeId=" + dictTypeId +
                ", dictName='" + dictName + '\'' +
                ", dictLevel='" + dictLevel + '\'' +
                ", dictType='" + dictType + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public DictionaryType(Long dictTypeId, String dictName, String dictLevel, String dictType, LocalDateTime createTime, LocalDateTime updateTime) {
        this.dictTypeId = dictTypeId;
        this.dictName = dictName;
        this.dictLevel = dictLevel;
        this.dictType = dictType;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public DictionaryType() {
    }
}
