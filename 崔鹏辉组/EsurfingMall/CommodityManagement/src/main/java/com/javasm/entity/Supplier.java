package com.javasm.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "supplier_id",type=IdType.ASSIGN_ID)

    private Long supplierId;


    private String supplierName;


    private String contactPerson;


    private String contactPhone;


    private String contactAddress;


    private String account;


    private String bankName;


    private Long bankId;


    private String contactEmail;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "Supplier{" +
            "supplierId=" + supplierId +
            ", supplierName=" + supplierName +
            ", contactPerson=" + contactPerson +
            ", contactPhone=" + contactPhone +
            ", contactAddress=" + contactAddress +
            ", account=" + account +
            ", bankName=" + bankName +
            ", bankId=" + bankId +
            ", contactEmail=" + contactEmail +
        "}";
    }
}
