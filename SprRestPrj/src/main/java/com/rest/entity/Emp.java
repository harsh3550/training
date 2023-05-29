package com.rest.entity;

public class Emp {
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Emp(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public Emp(){}

    @Override
    public String toString() {
        return "\nEmp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Emp e=(Emp)obj;
        return this.empId == e.empId;
    }
}
