package com.javasm.commons.utils;

import java.util.List;

/**
 * @author:19
 * @date: 2021/12/4 14:58
 * @className: ListUtil
 * @descrption:
 * @since: jdk1.8
 * @version: 0.1
 */

public class ListUtil {
    public static boolean notEmpty(List list){
        if (list == null)return false;
        if (list.size() < 0) return false;
        return true;
    }


}
