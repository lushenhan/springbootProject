package com.javasm.sys.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class DictionaryDatas implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "dictionary_datas_id", type = IdType.AUTO)

    private Long dictionaryDatasId;


    private String dictionaryDatasName;


    private Integer dictionaryDatasTypeid;


    private LocalDateTime createTime;


    private LocalDateTime updateTime;

    private String  dictType;

    private Integer entityId;

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Long getDictionaryDatasId() {
        return dictionaryDatasId;
    }

    public void setDictionaryDatasId(Long dictionaryDatasId) {
        this.dictionaryDatasId = dictionaryDatasId;
    }

    public String getDictionaryDatasName() {
        return dictionaryDatasName;
    }

    public void setDictionaryDatasName(String dictionaryDatasName) {
        this.dictionaryDatasName = dictionaryDatasName;
    }

    public Integer getDictionaryDatasTypeid() {
        return dictionaryDatasTypeid;
    }

    public DictionaryDatas(Long dictionaryDatasId, String dictionaryDatasName, Integer dictionaryDatasTypeid, LocalDateTime createTime, LocalDateTime updateTime, String dictType, Integer entityId) {
        this.dictionaryDatasId = dictionaryDatasId;
        this.dictionaryDatasName = dictionaryDatasName;
        this.dictionaryDatasTypeid = dictionaryDatasTypeid;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.dictType = dictType;
        this.entityId = entityId;
    }

    public void setDictionaryDatasTypeid(Integer dictionaryDatasTypeid) {
        this.dictionaryDatasTypeid = dictionaryDatasTypeid;
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
        return "DictionaryDatas{" +
                "dictionaryDatasId=" + dictionaryDatasId +
                ", dictionaryDatasName='" + dictionaryDatasName + '\'' +
                ", dictionaryDatasTypeid=" + dictionaryDatasTypeid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", dictType='" + dictType + '\'' +
                ", entityId=" + entityId +
                '}';
    }

    public DictionaryDatas() {
    }
}
