package com.dao;
import com.connection.ConnectionDB;
import com.model.Agreement;
import com.model.Customer;
import org.springframework.stereotype.Repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerAgreementDAO {
    public CustomerAgreementDAO(){}
    public boolean insertCustomer(Customer customer) {
        ConnectionDB.getConnection();
        String sql = "INSERT into LMS_CUSTOMER_M_16920 VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(sql);
            pst.setString(1, customer.getCustomer_id());
            pst.setString(2, customer.getFirst_name());
            pst.setString(3, customer.getLast_name());
            pst.setString(4, customer.getGender());
            pst.setString(5, customer.getDate_of_birth());
            pst.setLong(6, customer.getContact_number());
            pst.setString(7, customer.getEmail_address());
            pst.setDouble(8, customer.getMonthly_income());
            pst.setString(9, customer.getProfession());
            pst.setDouble(10, customer.getTotal_monthly_expense());
            pst.setString(11, customer.getDesignation());
            pst.setString(12, customer.getCompany_name());
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteCustomer(String customerId) throws
            SQLException {
        ConnectionDB.getConnection();
        try {
            String sql = "DELETE from LMS_CUSTOMER_M_16920 where CUSTOMER_ID=?";
            PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(sql);
            pst.setString(1, customerId);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public Customer getCustomer(String customerId) {
        ConnectionDB.getConnection();
        String sql = "SELECT * from LMS_CUSTOMER_M_16920 where CUSTOMER_ID=?";
        try {
            PreparedStatement pst =
                    ConnectionDB.getConnection().prepareStatement(sql);
            pst.setString(1, customerId);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                Customer customer = new Customer();
                customer.setCustomer_id(rst.getString(1));
                customer.setFirst_name(rst.getString(2));
                customer.setLast_name(rst.getString(3));
                customer.setGender(rst.getString(4));
                customer.setDate_of_birth(rst.getString(5));
                customer.setContact_number(rst.getLong(6));
                customer.setEmail_address(rst.getString(7));
                customer.setMonthly_income(rst.getDouble(8));
                customer.setProfession(rst.getString(9));

                customer.setTotal_monthly_expense(rst.getDouble(10));
                customer.setDesignation(rst.getString(11));
                customer.setCompany_name(rst.getString(12));
                return customer;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Customer> getCustomersByName(String customerName)
            throws SQLException, ClassNotFoundException {
        ConnectionDB.getConnection();
        List<Customer> cust = null;
        try {
            ResultSet rs =
                    ConnectionDB.getConnection().createStatement().executeQuery("SELECT * from LMS_CUSTOMER_M_16920 where FIRST_NAME='" + customerName + "'");
            cust = new ArrayList<>();
            while (rs.next()) {
                Customer e = new Customer(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4),
                        rs.getString(5), rs.getLong(6),
                        rs.getString(7),
                        rs.getLong(8), rs.getString(9),
                        rs.getLong(10),
                        rs.getString(11), rs.getString(12));
                cust.add(e);
            }
            return cust;
        } catch (SQLException e) {
            return null;
        }
    }
    public List<Customer> getAllCustomers(){
        ConnectionDB.getConnection();
        List<Customer> custArr = null;
        try {
            ResultSet rs =
                    ConnectionDB.getConnection().createStatement().executeQuery("SELECT * from LMS_CUSTOMER_M_16920");
                            custArr = new ArrayList<>();
            while (rs.next()) {
                Customer e = new Customer(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4),
                        rs.getString(5), rs.getLong(6),
                        rs.getString(7),
                        rs.getLong(8), rs.getString(9),
                        rs.getLong(10),
                        rs.getString(11), rs.getString(12));
                custArr.add(e);
            }
            return custArr;
        } catch (SQLException e) {
            return null;
        }
    }
    public boolean insertLoan(Agreement loan) {
        ConnectionDB.getConnection();
        String sql = "INSERT into LMS_AGREEMENT_DTL_DIP VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst =
                    ConnectionDB.getConnection().prepareStatement(sql);
            pst.setString(1, loan.getAgreement_id());
            pst.setString(2, loan.getLessee_id());
            pst.setDouble(3, loan.getTenure());
            pst.setDouble(4, loan.getRoi());
            pst.setDouble(5, loan.getLoan_amount());
            pst.setString(6, loan.getRepayment_frequency());
            pst.setString(7, loan.getLoan_disbursal_date());
            pst.setString(8, loan.getStatus());
            pst.setString(9, loan.getProduct_code());
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public List<Object> searchByCustomerId(String customerId){
        ConnectionDB.getConnection();
        List<Object> customerDetails = null;
        try {
            ResultSet rs =
                    ConnectionDB.getConnection().createStatement()
                            .executeQuery("SELECT * FROM LMS_CUSTOMER_M_16920AB Cus INNER JOIN LMS_AGREEMENT_DTL_16920AB Agr ON Cus.CUSTOMER_ID =
                                            Agr.Lesse_Id WHERE Cus.Customer_Id = '" + customerId + "'");
                                    customerDetails = new ArrayList<>();
            while (rs.next()) {
                CustomerAgreement customerAgreement = new
                        CustomerAgreement(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getLong(6),
                        rs.getString(7),
                        rs.getDouble(8),
                        rs.getString(9),
                        rs.getDouble(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14),
                        rs.getDouble(15),
                        rs.getDouble(16),
                        rs.getDouble(17),
                        rs.getString(18),
                        rs.getString(19),
                        rs.getString(20),
                        rs.getString(21)
                );
                customerDetails.add(customerAgreement);
            }
            return customerDetails;
        } catch (SQLException e) {
            return null;
        }
    }
    public List<Object> searchByAgreementId(String customerId){
        ConnectionDB.getConnection();
        List<Object> customerDetails = null;
        try {
            ResultSet rs =
                    ConnectionDB.getConnection().createStatement()
                            .executeQuery("SELECT * FROM LMS_CUSTOMER_M_16920AB Cus INNER JOIN LMS_AGREEMENT_DTL_16920AB Agr ON Cus.CUSTOMER_ID =
                                         Agr.Lesse_Id WHERE Agr.AGREEMENT_ID = '" + customerId + "'");
                                    customerDetails = new ArrayList<>();
            while (rs.next()) {
                CustomerAgreement customerAgreement = new
                        CustomerAgreement(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getLong(6),
                        rs.getString(7),
                        rs.getDouble(8),
                        rs.getString(9),
                        rs.getDouble(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14),
                        rs.getDouble(15),
                        rs.getDouble(16),
                        rs.getDouble(17),
                        rs.getString(18),
                        rs.getString(19),
                        rs.getString(20),
                        rs.getString(21)
                );
                customerDetails.add(customerAgreement);
            }
            return customerDetails;
        } catch (SQLException e) {
            return null;
        }
    }
}
