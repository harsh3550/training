package model;

import java.io.Serializable;
public class Employee implements Serializable {
    private String empName;
    private String email;
    private String qualification;
    private double yearsOfExperience;
    private String dateOfBirth;
    private String designation;

    public Employee() {
    }

    public Employee(String empName, String email, String qualification, double yearsOfExperience, String dateOfBirth) {
        this.empName = empName;
        this.email = email;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(String empName, String email, String qualification, double yearsOfExperience, String dateOfBirth, String designation) {
        this.empName = empName;
        this.email = email;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.dateOfBirth = dateOfBirth;
        this.designation = designation;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
