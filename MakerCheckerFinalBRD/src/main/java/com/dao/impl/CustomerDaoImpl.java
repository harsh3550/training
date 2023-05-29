package com.dao.impl;
import com.dao.CustomerDao;
import com.dao.Exception.ResourceNotFound;
import com.dao.entity.CustomerMaster;
import com.dao.entity.CustomerTemp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@EnableTransactionManagement
//@Transactional
@Repository
@Primary
public class CustomerDaoImpl implements CustomerDao {

    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    private SessionFactory sessionFactory;

    @Autowired
    public CustomerDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    //
    @Override
    public List<CustomerTemp> getAllCustomers() {
        return getSession().createQuery("select c from CustomerTemp c").getResultList();
    }

    @Override
    public void addCustomers(CustomerTemp customers) {
        getSession().persist(customers);
//        System.out.println("call from addcustomer dao impl");
    }

    @Override
    public void saveCustomers(CustomerTemp customers) {
        getSession().save(customers);
    }

    @Override
    public void deleteCustomers(int cid) {
        CustomerTemp customersToDelete = getByCustomerId(cid);
        getSession().remove(customersToDelete);
    }

    @Override
    public void updateCustomers(CustomerTemp customersTemp) {

        getSession().merge(customersTemp);
    }

    @Override
    public CustomerTemp getByCustomerId(int cid) {
        CustomerTemp customersTemp = getSession().get(CustomerTemp.class, cid);
        if (customersTemp == null)
            throw new ResourceNotFound("Customer with customer id: " + cid + " is not found");
        return customersTemp;
    }

    @Override
    public CustomerTemp getByCustomerCode(String code) {
        CustomerTemp customersTemp = getSession().get(CustomerTemp.class, code);
        return customersTemp;
    }

    @Override
    public CustomerTemp getByCustomerName(String customerName) {
        List<CustomerTemp> customers = getSession().createQuery
                        ("select c from CustomerTemp c where c.customerName=:customerName", CustomerTemp.class)
                .setParameter("customerName", customerName).getResultList();

        if (customers.size() == 0) {
            throw new ResourceNotFound("Customer " + customerName + " is not found");
        }
        return customers.get(0);
    }

    @Override
    public List<CustomerTemp> getAllNewRegisteredCustomerChecker() {
        return getSession().createQuery("select c from CustomerTemp c where recordStatus = 'N'")
                .getResultList();
    }

    @Override
    public void addCustomerMasterTable(CustomerMaster customerMaster) {
        getSession().persist(customerMaster);
    }

    @Override
    public void deleteCustomerMasterTable(CustomerMaster customerMaster) {
        getSession().remove(customerMaster);
    }

    @Override
    public void updateCustomerMasterTable(CustomerMaster customerMaster) {

        getSession().merge(customerMaster);
    }

    @Override
    public CustomerMaster getByCustomerIDFromMaster(int cid) {
        CustomerMaster customerMaster = getSession().get(CustomerMaster.class, cid);
        if (customerMaster == null)
            throw new ResourceNotFound("Customer with customer id: " + cid + " is not found");

        return customerMaster;
    }

    @Override
    public CustomerMaster getByCustomerCodeFromMaster(String code) {
        CustomerMaster customerMaster = (com.dao.entity.CustomerMaster) getSession().createQuery("select c from CustomerMaster c where customerCode=:customerCode")
                .setParameter("customerCode",  code)
                .getSingleResult();
        return customerMaster;
    }

    @Override
    public CustomerMaster getByCustomerNameFromMaster(String customerName) {
        List<CustomerMaster> customers = getSession().createQuery
                        ("select c from CustomerMaster c where c.customerName=:customerName", CustomerMaster.class)
                .setParameter("customerName", customerName).getResultList();

        if (customers.size() == 0) {
            throw new ResourceNotFound("Customer " + customerName + " is not found");
        }
        return customers.get(0);
    }

    @Override
    public List<CustomerMaster> getAllCustomerMaster() {
        return getSession().createQuery("from CustomerMaster").getResultList();
    }
}
