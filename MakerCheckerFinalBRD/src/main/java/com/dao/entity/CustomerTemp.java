package com.dao.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Objects;

@Repository
@Entity
@Table(name = "CUSTOMER_TEMP_16895")
public class CustomerTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, length = 10)
    private Integer cid;

    @Column(unique = true, length = 10)
    private String customerCode;

    @Column(unique = true, length = 30)
    private String customerName;

    @Column(length = 100)
    private String address1;

    @Column(length = 100)
    private String address2;

    @Column(length = 6)
    private Integer pinCode;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String contactNumber;

    @Column(length = 100)
    private String primaryContactPerson;

    private String recordStatus;

    private String createDate;

    @Column(length = 30)
    private String createdBy;

    //    @Temporal(TemporalType.DATE)
    private String modifiedDate;

    @Column(length = 30)
    private String modifiedBy;

    //    @Temporal(TemporalType.DATE)
    private String authorizedDate;

    @Column(length = 30)
    private String authorizedBy;

    public CustomerTemp(String customerCode, String customerName, String address1, String address2,
                         String email, String contactNumber, String primaryContactPerson) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.address1 = address1;
        this.address2 = address2;
        this.email = email;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
    }

    public CustomerTemp(Integer cid, String customerCode, String customerName, String address1,
                         String address2, Integer pinCode, String email, String contactNumber,
                         String primaryContactPerson, String recordStatus, String createDate,
                         String createdBy, String modifiedDate, String modifiedBy, String authorizedDate,
                         String authorizedBy) {
        this.cid = cid;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.address1 = address1;
        this.address2 = address2;
        this.pinCode = pinCode;
        this.email = email;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.authorizedDate = authorizedDate;
        this.authorizedBy = authorizedBy;
    }

    public CustomerTemp(String customerCode, String customerName, String address1, String address2, Integer pinCode,
                         String email, String contactNumber, String primaryContactPerson, String recordStatus, String createDate,
                         String createdBy, String modifiedDate, String modifiedBy, String authorizedDate, String authorizedBy) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.address1 = address1;
        this.address2 = address2;
        this.pinCode = pinCode;
        this.email = email;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.authorizedDate = authorizedDate;
        this.authorizedBy = authorizedBy;
    }

    public CustomerTemp() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPrimaryContactPerson() {
        return primaryContactPerson;
    }

    public void setPrimaryContactPerson(String primaryContactPerson) {
        this.primaryContactPerson = primaryContactPerson;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(String authorizedDate) {
        this.authorizedDate = authorizedDate;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    @Override
    public String toString() {
        return "CustomersTemp{" +
                "cid=" + cid +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", pinCode=" + pinCode +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", primaryContactPerson='" + primaryContactPerson + '\'' +
                ", recordStatus='" + recordStatus + '\'' +
                ", createDate=" + createDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", authorizedDate=" + authorizedDate +
                ", authorizedBy='" + authorizedBy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerTemp that = (CustomerTemp) o;
        return Objects.equals(cid, that.cid) && Objects.equals(customerCode, that.customerCode) && Objects.equals(customerName, that.customerName) && Objects.equals(address1, that.address1) && Objects.equals(address2, that.address2) && Objects.equals(pinCode, that.pinCode) && Objects.equals(email, that.email) && Objects.equals(contactNumber, that.contactNumber) && Objects.equals(primaryContactPerson, that.primaryContactPerson) && Objects.equals(recordStatus, that.recordStatus) && Objects.equals(createDate, that.createDate) && Objects.equals(createdBy, that.createdBy) && Objects.equals(modifiedDate, that.modifiedDate) && Objects.equals(modifiedBy, that.modifiedBy) && Objects.equals(authorizedDate, that.authorizedDate) && Objects.equals(authorizedBy, that.authorizedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, customerCode, customerName, address1, address2, pinCode, email, contactNumber, primaryContactPerson, recordStatus, createDate, createdBy, modifiedDate, modifiedBy, authorizedDate, authorizedBy);
    }
}

