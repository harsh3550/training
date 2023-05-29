package com.service.impl;

import com.dao.CustomerDao;
import com.dao.entity.CustomerMaster;
import com.dao.entity.CustomerTemp;
import com.service.CustomerService;
import com.service.loggingaspect.myLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableTransactionManagement
@Transactional
@Service(value = "customerservice")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    //****CUSTOMER TEMP METHODS*****
    @Override
    @myLogger
    public List<CustomerTemp> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public void addCustomer(CustomerTemp customersTemp) {
        customerDao.addCustomers(customersTemp);
    }

    @Override
    public void saveCustomers(CustomerTemp customers) {
        customerDao.saveCustomers(customers);
    }

    @Override
    public void deleteCustomer(int cid) {
        customerDao.deleteCustomers(cid);
    }

    @Override
    public void updateCustomer(CustomerTemp customersTemp) {
        customerDao.updateCustomers(customersTemp);
    }

    @Override
    @myLogger
    public CustomerTemp getByCustomerId(int cid) {
        return customerDao.getByCustomerId(cid);
    }

    @myLogger
    @Override
    public CustomerTemp getByCustomerCode(String code) {
        return customerDao.getByCustomerCode(code);
    }

    @myLogger
    @Override
    public CustomerTemp getByCustomerName(String customerName) {
        return customerDao.getByCustomerName(customerName);
    }

    //*********CUSTOMER MASTER METHODS*******
    @Override
    @myLogger
    public List<CustomerTemp> getAllNewRegisteredCustomerChecker() {
        return customerDao.getAllNewRegisteredCustomerChecker();
    }

    @Override
    public void addCustomerMasterTable(CustomerMaster customerMaster) {
        customerDao.addCustomerMasterTable(customerMaster);
    }

    @Override
    public void deleteCustomerMasterTable(CustomerMaster customerMaster) {
        customerDao.deleteCustomerMasterTable(customerMaster);
    }

    @Override
    public void updateCustomerMasterTable(CustomerMaster customerMaster) {
        customerDao.updateCustomerMasterTable(customerMaster);
    }

    @Override
    public CustomerMaster getByCustomerIDFromMaster(int cid) {
        return customerDao.getByCustomerIDFromMaster(cid);
    }

    @Override
    public CustomerMaster getByCustomerCodeFromMaster(String code) {
        return customerDao.getByCustomerCodeFromMaster(code);
    }

    @Override
    public CustomerMaster getByCustomerNameFromMaster(String customerName) {
        return customerDao.getByCustomerNameFromMaster(customerName);
    }

    @Override
    @myLogger
    public List<CustomerMaster> getAllCustomerMaster() {
        return customerDao.getAllCustomerMaster();
    }
}
