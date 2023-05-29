package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDao {
        public static void main(String[] args) {
            int result = 0;
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:training@//10.1.50.198:1535/nsbt19c", "training", "training");
                Statement stmt = con.createStatement();
                System.out.println("connection stablished");
                result = stmt.executeUpdate("INSERT INTO Employee_Harsh1 values(111,'25-Jul-2001', 'Employee1', 'imharsh@nsbt.com')");
            } catch (ClassNotFoundException | SQLException e){
                System.out.println(e);
            }
            System.out.println(result +" "+ "data stored");
        }
    }