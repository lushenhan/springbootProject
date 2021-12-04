package com.javasm.commons.base;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.commons.entity.AxiosResult;
import com.javasm.commons.entity.TableDatas;
import com.javasm.commons.utils.ServletUtil;


import java.util.List;

public class BaseController {

    public void startPage(){
        Integer pageNum = ServletUtil.getParameter("pageNum", 1);
        Integer pageSize = ServletUtil.getParameter("pageSize", 3);
        PageHelper.startPage(pageNum,pageSize);
    }

    public TableDatas tableDatas(List list){
        PageInfo info = new PageInfo<>(list);
        TableDatas tableDatas = new TableDatas();
        tableDatas.setList(info.getList());
        tableDatas.setPageNum(info.getPageNum());
        tableDatas.setPageSize(info.getPageSize());
        tableDatas.setTotal((int)info.getTotal());
        return tableDatas;
    }

    public AxiosResult suc(){
        return AxiosResult.suc();
    }

    public AxiosResult suc(Object data){
        return AxiosResult.suc(data);
    }
}
