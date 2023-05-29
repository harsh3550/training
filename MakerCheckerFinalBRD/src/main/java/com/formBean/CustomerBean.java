package com.formBean;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


import javax.validation.constraints.Size;
import java.util.Objects;

public class CustomerBean {
    private Integer cid;
    @NotEmpty(message = "Customer code can not be blank")
    @Size(max = 10, min = 1, message = "Customer code length needs to be 10")
    private String customerCode;
    @NotEmpty(message = "Customer name can not be blank")
    @Size(max = 20, min = 1, message = "Customer name length can not be more than 30")
    private String customerName;
    @NotEmpty(message = "Customer address1 can not be blank")
    @Size(max = 100, min = 1, message = "Customer address length can not be more than 100")
    private String address1;
    @Size(max = 100, min = 1, message = "Customer address2 length can not be more than 100")
    private String address2;
    @NotEmpty(message = "Email address can not be blank")
    @Email(message = "Invalid email address")
    private String email;


    @Size(max = 20, min = 10, message = "Contact number length should be atleast 10")
    private String contactNumber;

    @NotEmpty(message = "Primary contact person can not be blank")
    @Size(max = 100, min = 1, message = "Input length can not be more than 100")
    private String primaryContactPerson;

    public CustomerBean(Integer cid, String customerCode, String customerName, String address1,
                            String address2, String email, String contactNumber, String primaryContactPerson) {
        this.cid = cid;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.address1 = address1;
        this.address2 = address2;
        this.email = email;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
    }

//    public CustomerFormBean(String customerCode, String customerName, String address1, String address2,
//                            String email, String contactNumber, String primaryContactPerson) {
//        this.customerCode = customerCode;
//        this.customerName = customerName;
//        this.address1 = address1;
//        this.address2 = address2;
//        this.email = email;
//        this.contactNumber = contactNumber;
//        this.primaryContactPerson = primaryContactPerson;
//    }

    public CustomerBean() {
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

    @Override
    public String toString() {
        return "CustomerFormBean{" +
                "cid=" + cid +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", primaryContactPerson='" + primaryContactPerson + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBean that = (CustomerBean) o;
        return Objects.equals(cid, that.cid) && Objects.equals(customerCode, that.customerCode) && Objects.equals(customerName, that.customerName) && Objects.equals(address1, that.address1) && Objects.equals(address2, that.address2) && Objects.equals(email, that.email) && Objects.equals(contactNumber, that.contactNumber) && Objects.equals(primaryContactPerson, that.primaryContactPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, customerCode, customerName, address1, address2, email, contactNumber, primaryContactPerson);
    }
}
