package com.javasm.commons.enums;

public enum  E {
    ARITHMETIC(50001,"除数为0"),
    NULLPOINTER(50002,"空指针"),
    NO_USER(50003,"用户名不存在"),
    PWD_ERROR(50004,"密码错误"),
    VALIDATE_ERROR(50005,"验证码错误"),
    NO_LOGIN(50006,"未登录"),
    ;
    private Integer code;
    private String msg;

    E(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
