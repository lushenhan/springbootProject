package com.javasm.sys.mapper;

import com.javasm.sys.entity.DictionaryDatas;
import com.javasm.sys.entity.DictionaryType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface DictionaryTypeMapper extends BaseMapper<DictionaryType> {

    List<DictionaryDatas> queryByArray(String[] typesArray);
}
