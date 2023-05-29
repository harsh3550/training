package com.controller;

import com.dao.entity.CustomerMaster;
import com.dao.entity.CustomerTemp;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class CheckerController {
    private CustomerService customerService;

    @Autowired
    public CheckerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    private CustomerMaster changeCustomerTempToCustomerMaster(CustomerTemp customersTemp) {
        CustomerMaster customerMaster = new CustomerMaster();
        customerMaster.setAuthorizedBy(customersTemp.getAuthorizedBy());
        customerMaster.setCid(customersTemp.getCid());
        customerMaster.setAddress1(customersTemp.getAddress1());
        customerMaster.setAddress2(customersTemp.getAddress2());
        customerMaster.setCustomerCode(customersTemp.getCustomerCode());
        customerMaster.setCustomerName(customersTemp.getCustomerName());
        customerMaster.setContactNumber(customersTemp.getContactNumber());
        customerMaster.setPinCode(customersTemp.getPinCode());
        customerMaster.setCreatedBy(customersTemp.getCreatedBy());
        customerMaster.setCreateDate(customersTemp.getCreateDate());
        customerMaster.setAuthorizedDate(customersTemp.getAuthorizedDate());
        customerMaster.setEmail(customersTemp.getEmail());
        customerMaster.setModifiedBy(customersTemp.getModifiedBy());
        customerMaster.setModifiedDate(customersTemp.getModifiedDate());
        customerMaster.setPrimaryContactPerson(customersTemp.getPrimaryContactPerson());
        customerMaster.setRecordStatus(customersTemp.getRecordStatus());
        return customerMaster;
    }

    @GetMapping(path = "checker")
    public String checkerHome(ModelMap model) {
        model.addAttribute("newRegisterCustomerList", customerService.getAllCustomers());
        List<CustomerTemp> list = customerService.getAllNewRegisteredCustomerChecker();
        return "checker";
    }

    @GetMapping("approveCustomer")
    public String approveCustomer(ModelMap modelMap, @RequestParam(name = "cid") Integer customerId, @RequestParam(name = "status") String status) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateInString = date.format(now);

        if (status.equals("N")) {
            CustomerTemp customersTemp = customerService.getByCustomerId(customerId);
            CustomerMaster customerMaster = changeCustomerTempToCustomerMaster(customersTemp);

            customerMaster.setRecordStatus("A");
            customerMaster.setAuthorizedBy("checker");
            customerMaster.setAuthorizedDate(currentDateInString);

            customerService.addCustomerMasterTable(customerMaster);
            customerService.deleteCustomer(customerId);
        } else if (status.equals("D")) {
            CustomerTemp customersTemp = customerService.getByCustomerId(customerId);
            CustomerMaster customerMaster = changeCustomerTempToCustomerMaster(customersTemp);

            customerService.deleteCustomer(customerId);
            customerService.deleteCustomerMasterTable(customerMaster);

        } else if (status.equals("M")) {


            CustomerTemp customersTemp = customerService.getByCustomerId(customerId);

            CustomerMaster customerMaster1 = customerService.getByCustomerCodeFromMaster(customersTemp.getCustomerCode());

            CustomerMaster customerMaster = changeCustomerTempToCustomerMaster(customersTemp);

            customerMaster.setRecordStatus("A");
            customerMaster.setCid(customerMaster1.getCid());
            customerMaster.setAuthorizedBy("checker");
            customerMaster.setAuthorizedDate(currentDateInString);

            customerService.updateCustomerMasterTable(customerMaster);

            customerService.deleteCustomer(customersTemp.getCid());

        }
        return "redirect:checker";
    }

    @GetMapping("rejectCustomer")
    public String rejectCustomer(ModelMap modelMap, @RequestParam(name = "cid") Integer customerId) {
        CustomerTemp customersTemp = customerService.getByCustomerId(customerId);

        if (customersTemp.getRecordStatus().equals("N")) {
            customersTemp.setRecordStatus("NR");
            customerService.updateCustomer(customersTemp);
        }
        if (customersTemp.getRecordStatus().equals("M")) {
            customersTemp.setRecordStatus("MR");
            CustomerMaster customerMaster = changeCustomerTempToCustomerMaster(customersTemp);

            customerService.updateCustomer(customersTemp);
            customerMaster.setRecordStatus("A");

        }
        if (customersTemp.getRecordStatus().equals("D")) {
            customersTemp.setRecordStatus("DR");
//            customerService.saveCustomers(customersTemp);
            customerService.updateCustomer(customersTemp);
        }
        return "redirect:checker";
    }
}
