package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Younger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the employee ID : ");
        String empId = sc.next();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@10.1.50.198:1535:nsbt19c",
                    "training", "training");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee_Harsh1 WHERE DateOfBirth > (SELECT DateOfBirth FROM Employee_Harsh1 WHERE EMPLOYEEID = " + empId + ")");
            while(rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2)
                        + " " + rs.getString(3) + " " + rs.getString(4));
        } catch(Exception e){
            System.out.println(e);
        }
    }
}


