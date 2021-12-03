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


    @TableId(value = "dictionary_type_id", type = IdType.AUTO)

    private Long dictionaryTypeId;

    /**
     * 字典名称
     */

    private String dictionaryName;


    private String dictionaryLevel;


    private String dictionaryParent;


    private LocalDateTime createTime;


    private LocalDateTime updateTime;

    public Long getDictionaryTypeId() {
        return dictionaryTypeId;
    }

    public void setDictionaryTypeId(Long dictionaryTypeId) {
        this.dictionaryTypeId = dictionaryTypeId;
    }
    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }
    public String getDictionaryLevel() {
        return dictionaryLevel;
    }

    public void setDictionaryLevel(String dictionaryLevel) {
        this.dictionaryLevel = dictionaryLevel;
    }
    public String getDictionaryParent() {
        return dictionaryParent;
    }

    public void setDictionaryParent(String dictionaryParent) {
        this.dictionaryParent = dictionaryParent;
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
            "dictionaryTypeId=" + dictionaryTypeId +
            ", dictionaryName=" + dictionaryName +
            ", dictionaryLevel=" + dictionaryLevel +
            ", dictionaryParent=" + dictionaryParent +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
