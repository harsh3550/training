package com.dao;

import com.dao.entity.CustomerMaster;
import com.dao.entity.CustomerTemp;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public interface CustomerDao {

    //******CUSTOMER TEMP METHODS******
    public List<CustomerTemp> getAllCustomers();

    public void addCustomers(CustomerTemp customersTemp);

    public void deleteCustomers(int cid);

    public void updateCustomers(CustomerTemp customersTemp);

    public CustomerTemp getByCustomerId(int cid);

    public CustomerTemp getByCustomerCode(String code);

    public CustomerTemp getByCustomerName(String customerName);

    public void saveCustomers(CustomerTemp customers);

    //******CUSTOMER MASTER METHODS****
    public List<CustomerTemp> getAllNewRegisteredCustomerChecker();

    public List<CustomerMaster> getAllCustomerMaster();

    public void addCustomerMasterTable(CustomerMaster customerMaster);

    public void deleteCustomerMasterTable(CustomerMaster customerMaster);

    public void updateCustomerMasterTable(CustomerMaster customerMaster);

    public CustomerMaster getByCustomerIDFromMaster(int cid);

    public CustomerMaster getByCustomerCodeFromMaster(String code);

    public CustomerMaster getByCustomerNameFromMaster(String customerName);

}
