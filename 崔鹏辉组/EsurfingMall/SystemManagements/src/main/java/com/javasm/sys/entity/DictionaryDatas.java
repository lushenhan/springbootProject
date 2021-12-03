package com.javasm.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
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
            ", dictionaryDatasName=" + dictionaryDatasName +
            ", dictionaryDatasTypeid=" + dictionaryDatasTypeid +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
