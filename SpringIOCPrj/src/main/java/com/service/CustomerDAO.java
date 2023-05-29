package com.service;
import com.database.CustomerTableInteraction;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerDAO {
    private static final Logger log =
            LogManager.getLogger(CustomerDAO.class);
    public CustomerDAO(){}
    public boolean registerCustomer(Customer customer){
        if(Period.between(customer.getDateOfBirth().toLocalDate(),
                LocalDate.now()).getYears() < 21){
            log.info("Age of the customer is too low to be registered...");
            return false;
        }
        else {
            CustomerTableInteraction cti = new
                    CustomerTableInteraction();
            return cti.registerCustomer(customer);
        }
    }
    public boolean updateCustomer(Customer customer){
        CustomerTableInteraction cti = new CustomerTableInteraction();
        return cti.updateCustomer(customer);
    }
    public boolean deleteCustomer(String customerId){
        CustomerTableInteraction cti = new CustomerTableInteraction();
        return cti.deleteCustomer(customerId);
    }
    public List<Customer> getCustomer(String customerId) throws
            CustomerNotFoundException{
        CustomerTableInteraction cti = new CustomerTableInteraction();
        return cti.getCustomer(customerId);
    }
    public List<Customer> getAllCustomers(){
        CustomerTableInteraction cti = new CustomerTableInteraction();
        return cti.getAllCustomers();
    }
    public List<Customer> getCustomersByName(String custName){
        CustomerTableInteraction cti = new CustomerTableInteraction();
        return cti.getCustomerByName(custName);
    }
}