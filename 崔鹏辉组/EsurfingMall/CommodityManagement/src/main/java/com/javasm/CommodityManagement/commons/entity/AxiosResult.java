package com.javasm.CommodityManagement.commons.entity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.javasm.CommodityManagement.enums.E;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult {
    private Integer code;
    private String msg;
    private Object data;

    public static AxiosResult suc(){
        return new AxiosResult(20000,"suc");
    }

    public static AxiosResult suc(Object data){
        return new AxiosResult(20000,"suc",data);
    }

    public static AxiosResult error(){
        return new AxiosResult(50000,"error");
    }

    public static AxiosResult error(Object data){
        return new AxiosResult(50000,"error",data);
    }

    public static AxiosResult error(E e){
        return new AxiosResult(e.getCode(),e.getMsg());
    }

    public AxiosResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public AxiosResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
