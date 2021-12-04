package com.javasm.sys.service;

import com.javasm.sys.entity.DictionaryDatas;
import com.javasm.sys.entity.DictionaryType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface IDictionaryTypeService extends IService<DictionaryType> {

    Map<String,List<DictionaryDatas>> queryByTypes(String[] split);
}
