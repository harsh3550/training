package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee ID : ");
            int empId = sc.nextInt();
            System.out.println("Enter DOB : ");
            String dateOfBirth = sc.next();
            System.out.println("Enter the Employee Name : ");
            String empName = sc.next();
            System.out.println("Enter the Employee Address : ");
            String empAdd = sc.next();
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@10.1.50.198:1535:nsbt19c",
                        "training", "training");
                PreparedStatement stmt = con.prepareStatement("INSERT INTO Employee_Harsh1 VALUES(?, ?, ?, ?)");
                stmt.setInt(1, empId);
                stmt.setString(2, dateOfBirth);
                stmt.setString(3, empName);
                stmt.setString(4, empAdd);
                int i = stmt.executeUpdate();
                System.out.println(i + " records inserted");
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
