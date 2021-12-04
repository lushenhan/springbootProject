package com.javasm.sys.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "sys_id", type = IdType.AUTO)

        private Long sysId;

    /**
     * 用户登录名
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String sysLogin;

    /**
     * 用户姓名
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String sysName;

    /**
     * 归属部门
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String sysDepartment;

    /**
     * 用户状态
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String sysState;

    /**
     * 用户职务
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String sysOffice;

    /**
     * 手机号
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String sysPhones;

    /**
     * 用户邮箱
     */

    private String sysEmail;

    /**
     * 备注
     */

    private String sysRemark;

    /**
     * 所属角色
     */
    @TableField(whereStrategy = FieldStrategy.NOT_NULL)
    private String sysRole;


    private String sysAdress;


    private LocalDateTime createTime;


    private LocalDateTime updateTime;

    public Long getSysId() {
        return sysId;
    }

    public void setSysId(Long sysId) {
        this.sysId = sysId;
    }

    public String getSysLogin() {
        return sysLogin;
    }

    public void setSysLogin(String sysLogin) {
        this.sysLogin = sysLogin;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysDepartment() {
        return sysDepartment;
    }

    public void setSysDepartment(String sysDepartment) {
        this.sysDepartment = sysDepartment;
    }

    public String getSysState() {
        return sysState;
    }

    public void setSysState(String sysState) {
        this.sysState = sysState;
    }

    public String getSysOffice() {
        return sysOffice;
    }

    public void setSysOffice(String sysOffice) {
        this.sysOffice = sysOffice;
    }

    public String getSysPhones() {
        return sysPhones;
    }

    public void setSysPhones(String sysPhones) {
        this.sysPhones = sysPhones;
    }

    public String getSysEmail() {
        return sysEmail;
    }

    public void setSysEmail(String sysEmail) {
        this.sysEmail = sysEmail;
    }

    public String getSysRemark() {
        return sysRemark;
    }

    public void setSysRemark(String sysRemark) {
        this.sysRemark = sysRemark;
    }

    public String getSysRole() {
        return sysRole;
    }

    public void setSysRole(String sysRole) {
        this.sysRole = sysRole;
    }

    public String getSysAdress() {
        return sysAdress;
    }

    public void setSysAdress(String sysAdress) {
        this.sysAdress = sysAdress;
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
        return "User{" +
                "sysId=" + sysId +
                ", sysLogin=" + sysLogin +
                ", sysName=" + sysName +
                ", sysDepartment=" + sysDepartment +
                ", sysState=" + sysState +
                ", sysOffice=" + sysOffice +
                ", sysPhones=" + sysPhones +
                ", sysEmail=" + sysEmail +
                ", sysRemark=" + sysRemark +
                ", sysRole=" + sysRole +
                ", sysAdress=" + sysAdress +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }
}
