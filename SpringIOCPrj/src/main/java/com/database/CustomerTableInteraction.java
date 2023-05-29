package com.database;
import com.service.Customer;
import com.service.CustomerNotFoundException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class CustomerTableInteraction {
    private static final Logger log =
            LogManager.getLogger("CustomerTableInteraction.class");
    public boolean registerCustomer(Customer customer) {
        int i = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            log.info("Class Not Found");
        }
        try (Connection con =
                     DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535/nsbt19c ", "sh", "sh");
                             PreparedStatement stmt = con.prepareStatement("insert into LMS_CUSTOMER_M_16894 values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
        stmt.setString(1, customer.getCustomerId());
        stmt.setString(2, customer.getFirstName());
        stmt.setString(3, customer.getLastName());
        stmt.setString(4, customer.getGender());
        stmt.setDate(5, customer.getDateOfBirth());
        stmt.setLong(6, customer.getContactNumber());
        stmt.setString(7, customer.getEmailAddress());
        stmt.setDouble(8, customer.getMonthlyIncome());
        stmt.setString(9, customer.getProfession());
        stmt.setDouble(10, customer.getTotalMonthlyExpenses());
        stmt.setString(11, customer.getDesignation());
        stmt.setString(12, customer.getCompanyName());
        i = stmt.executeUpdate();
    } catch (SQLException e) {
        log.info(e.getMessage());
    }
 return !(i == 0);
}
    public boolean updateCustomer(Customer customer) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            log.info("Class Not Found");
        }
        String query = "update LMS_CUSTOMER_M_16894 set first_name = '"
                + customer.getFirstName()+ "' where customer_id = '" +
                customer.getCustomerId() +"'";
        try (Connection con =
                     DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535/nsbt19c ", "sh", "sh");
                             Statement stmt = con.prepareStatement(query)) {
            return stmt.execute(query);
        } catch (SQLException e) {
            log.info(e.getMessage());
        }
        return false;
    }
    public boolean deleteCustomer(String customerId) {
        int i = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            log.info("Class Not Found");
        }
        String query = "delete from LMS_CUSTOMER_M_16894 where CUSTOMER_ID = '" + customerId + "'";
        try (Connection con =
                     DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535/nsbt19c ", "sh", "sh");
                             PreparedStatement stmt = con.prepareStatement(query)) {
            i = stmt.executeUpdate();
        } catch (SQLException e) {
            log.info(e.getMessage());
        }
        return !(i == 0);
    }
    public List<Customer> getCustomer(String customerId) {
        List<Customer> customers = new ArrayList<>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            log.info("Class Not Found");
        }
        String query = "select * from LMS_CUSTOMER_M_16894 where CUSTOMER_ID = '" + customerId + "'";
        try (Connection con =
                     DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535/nsbt19c ", "sh", "sh");
                             PreparedStatement stmt = con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            if (rs == null || !(rs.next())) throw new
                    CustomerNotFoundException();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("CUSTOMER_ID"));
                customer.setFirstName(rs.getString("FIRST_NAME"));
                customer.setLastName(rs.getString("LAST_NAME"));
                customer.setGender(rs.getString("GENDER"));
                customer.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));

                customer.setContactNumber(rs.getLong("CONTACT_NUMBER"));

                customer.setEmailAddress(rs.getString("EMAIL_ADDRESS"));

                customer.setMonthlyIncome(rs.getDouble("MONTHLY_INCOME"));
                customer.setProfession(rs.getString("PROFESSION"));

                customer.setTotalMonthlyExpenses(rs.getDouble("TOTAL_MONTHLY_EXPENSE"))
                ;
                customer.setDesignation(rs.getString("DESIGNATION"));
                customer.setCompanyName(rs.getString("COMPANY_NAME"));
                customers.add(customer);
            }
            return customers;
        } catch (SQLException e) {
            log.info(e.getMessage());
        }
        return customers;
    }
    public List<Customer> getAllCustomers() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            log.info("Class Not Found");
        }
        String query = "select * from LMS_CUSTOMER_M_16894";
        try (Connection con =
                     DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535/nsbt19c ", "sh", "sh");
                             PreparedStatement stmt = con.prepareStatement(query)) {
            List<Customer> customers = new ArrayList<>();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("CUSTOMER_ID"));
                customer.setFirstName(rs.getString("FIRST_NAME"));
                customer.setLastName(rs.getString("LAST_NAME"));
                customer.setGender(rs.getString("GENDER"));
                customer.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));

                customer.setContactNumber(rs.getLong("CONTACT_NUMBER"));

                customer.setEmailAddress(rs.getString("EMAIL_ADDRESS"));

                customer.setMonthlyIncome(rs.getDouble("MONTHLY_INCOME"));
                customer.setProfession(rs.getString("PROFESSION"));

                customer.setTotalMonthlyExpenses(rs.getDouble("TOTAL_MONTHLY_EXPENSE"))
                ;
                customer.setDesignation(rs.getString("DESIGNATION"));
                customer.setCompanyName(rs.getString("COMPANY_NAME"));
                customers.add(customer);
            }
            return customers;
        } catch (SQLException e) {
            log.info(e.getMessage());
        }
        return null;
    }
    public List<Customer> getCustomerByName(String firstName) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            log.info("Class Not Found");
        }
        String query = "select * from LMS_CUSTOMER_M_16894 where FIRST_NAME = '" + firstName + "'";
        try (Connection con =
                     DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535/nsbt19c ", "sh", "sh");
                             PreparedStatement stmt = con.prepareStatement(query)) {
            List<Customer> customers = new ArrayList<>();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("CUSTOMER_ID"));
                customer.setFirstName(rs.getString("FIRST_NAME"));
                customer.setLastName(rs.getString("LAST_NAME"));
                customer.setGender(rs.getString("GENDER"));
                customer.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));

                customer.setContactNumber(rs.getLong("CONTACT_NUMBER"));

                customer.setEmailAddress(rs.getString("EMAIL_ADDRESS"));

                customer.setMonthlyIncome(rs.getDouble("MONTHLY_INCOME"));
                customer.setProfession(rs.getString("PROFESSION"));

                customer.setTotalMonthlyExpenses(rs.getDouble("TOTAL_MONTHLY_EXPENSE"));
                customer.setDesignation(rs.getString("DESIGNATION"));
                customer.setCompanyName(rs.getString("COMPANY_NAME"));
                customers.add(customer);
            }
            return customers;
        } catch (SQLException e) {
            log.info(e.getMessage());
        }
        return null;
    }
}