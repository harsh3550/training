package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.sql.Date;
@Service
public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private long contactNumber;
    private String emailAddress;
    private double monthlyIncome;
    private String profession;
    private double totalMonthlyExpenses;
    private String designation;
    private String companyName;
    public Customer(){}
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public double getMonthlyIncome() {
        return monthlyIncome;
    }
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public double getTotalMonthlyExpenses() {
        return totalMonthlyExpenses;
    }
    public void setTotalMonthlyExpenses(double totalMonthlyExpenses) {
        this.totalMonthlyExpenses = totalMonthlyExpenses;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    @Override
    public String toString() {
        return "\nCustomer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", contactNumber=" + contactNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", profession='" + profession + '\'' +
                ", totalMonthlyExpenses=" + totalMonthlyExpenses +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
