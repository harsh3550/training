package com.connection;
import org.springframework.stereotype.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
public class ConnectionDB {
    public static java.sql.Connection connection;
    public static java.sql.Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection =
                    DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535/nsbt 19c", "training", "training");
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
