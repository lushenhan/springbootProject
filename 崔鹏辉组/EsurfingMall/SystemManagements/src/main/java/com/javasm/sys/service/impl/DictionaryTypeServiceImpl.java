package com.javasm.sys.service.impl;

import com.javasm.commons.utils.ListUtil;
import com.javasm.sys.entity.DictionaryDatas;
import com.javasm.sys.entity.DictionaryType;
import com.javasm.sys.mapper.DictionaryTypeMapper;
import com.javasm.sys.service.IDictionaryTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DictionaryTypeServiceImpl extends ServiceImpl<DictionaryTypeMapper, DictionaryType> implements IDictionaryTypeService {

    @Override
    public Map<String, List<DictionaryDatas>> queryByTypes(String[] typesArray) {
        Map<String, List<DictionaryDatas>> maps = new HashMap<>();
        List<DictionaryDatas> datas = baseMapper.queryByArray(typesArray);
        List<DictionaryDatas> list = new ArrayList<>(16);
        if (!ListUtil.notEmpty(datas))return null;
        for (String type : typesArray) {
            for (DictionaryDatas data : datas) {
                if (type.equals(data.getDictType()))
                    list.add(data);
            }
            maps.put(type , list);
            list = new ArrayList<>();
        }
        return maps;
    }
}
