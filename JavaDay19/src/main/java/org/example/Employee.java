package org.example;

public class Employee {
        private int employeeId;
        private String dateOfBirth;
        private String employeeName;
        private String employeeAddress;

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeAddress() {
            return employeeAddress;
        }

        public void setEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;
        }

        public Employee(int employeeId, String dateOfBirth, String
                employeeName, String employeeAddress) {
            this.employeeId = employeeId;
            this.dateOfBirth = dateOfBirth;
            this.employeeName = employeeName;
            this.employeeAddress = employeeAddress;
        }

        @Override
        public String toString() {
            return "\nemployee{" +
                    "employeeId=" + employeeId +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", employeeName='" + employeeName + '\'' +
                    ", employeeAddress='" + employeeAddress + '\'' +
                    '}';
        }
    }