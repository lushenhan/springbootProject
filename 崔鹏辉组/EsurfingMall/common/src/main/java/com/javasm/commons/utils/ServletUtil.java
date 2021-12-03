package com.javasm.commons.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletUtil {
    public static ServletRequestAttributes getRequestAttributes(){
        ServletRequestAttributes r =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return r;
    }

    public static HttpServletRequest getRequest(){
        return getRequestAttributes().getRequest();
    }

    public static Integer getParameter(String pname,Integer defaultValue){
        String value = getRequest().getParameter(pname);
        if(value!=null)
            return Integer.parseInt(value);
        return defaultValue;
    }

    public static String getParameter(String pname,String defaultValue){
        String value = getRequest().getParameter(pname);
        if(value!=null)
            return value;
        return defaultValue;
    }

    public static Double getParameter(String pname,Double defaultValue){
        String value = getRequest().getParameter(pname);
        if(value!=null)
            return Double.parseDouble(value);
        return defaultValue;
    }

    public static HttpServletResponse getResponse(){
        return getRequestAttributes().getResponse();
    }

    public static HttpSession getSession(){
        return getRequest().getSession();
    }

    public static ServletContext getServletContext(){
        return getRequest().getServletContext();
    }

    public static String getRootPath(){
        return getServletContext().getRealPath("/");
    }
}
