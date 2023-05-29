package com.rest.entity;
public class Employee {
    String empName;
    String educationQualification;
    String dateofJoining;
    String emailAddress;
    long contactNumber;
    String designation;
    String employeeid;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public void setDateofJoining(String dateofJoining) {
        this.dateofJoining = dateofJoining;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public String getDateofJoining() {
        return dateofJoining;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", educationQualification='" + educationQualification + '\'' +
                ", dateofJoining='" + dateofJoining + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactNumber=" + contactNumber +
                ", designation='" + designation + '\'' +
                ", employeeid='" + employeeid + '\'' +
                '}';
    }
}


