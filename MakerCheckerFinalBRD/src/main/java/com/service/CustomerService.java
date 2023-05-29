package com.service;

import com.dao.entity.CustomerMaster;
import com.dao.entity.CustomerTemp;
import com.service.loggingaspect.myLogger;

import java.util.List;

public interface CustomerService {

    //*******CUSTOMER TEMP METHODS********
    public List<CustomerTemp> getAllCustomers();

    @myLogger
    public void addCustomer(CustomerTemp customersTemp);

    @myLogger
    public void saveCustomers(CustomerTemp customers);

    @myLogger
    public void deleteCustomer(int cid);

    @myLogger
    public void updateCustomer(CustomerTemp customerTemp);

    public CustomerTemp getByCustomerId(int cid);

    public CustomerTemp getByCustomerCode(String code);

    public CustomerTemp getByCustomerName(String customerName);

    //*****CUSTOMER MASTER METHODS*******
    public List<CustomerTemp> getAllNewRegisteredCustomerChecker();

    public List<CustomerMaster> getAllCustomerMaster();

    public void addCustomerMasterTable(CustomerMaster customerMaster);

    public void deleteCustomerMasterTable(CustomerMaster customerMaster);

    public void updateCustomerMasterTable(CustomerMaster customerMaster);

    public CustomerMaster getByCustomerIDFromMaster(int cid);

    public CustomerMaster getByCustomerCodeFromMaster(String code);

    public CustomerMaster getByCustomerNameFromMaster(String customerName);
}