package com.controller;

import com.dao.entity.CustomerMaster;
import com.dao.entity.CustomerTemp;
import com.formBean.CustomerBean;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class MakerController {
    private CustomerService customerService;

    @Autowired
    public MakerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    private CustomerTemp changeCustomerMasterToCustomerTemp(CustomerMaster cMaster) {
        CustomerTemp customerTemp = new CustomerTemp();
        customerTemp.setAuthorizedBy(cMaster.getAuthorizedBy());
        customerTemp.setCid(cMaster.getCid());
        customerTemp.setAddress1(cMaster.getAddress1());
        customerTemp.setAddress2(cMaster.getAddress2());
        customerTemp.setCustomerCode(cMaster.getCustomerCode());
        customerTemp.setCustomerName(cMaster.getCustomerName());
        customerTemp.setContactNumber(cMaster.getContactNumber());
        customerTemp.setPinCode(cMaster.getPinCode());
        customerTemp.setCreatedBy(cMaster.getCreatedBy());
        customerTemp.setCreateDate(cMaster.getCreateDate());
        customerTemp.setAuthorizedDate(cMaster.getAuthorizedDate());
        customerTemp.setEmail(cMaster.getEmail());
        customerTemp.setModifiedBy(cMaster.getModifiedBy());
        customerTemp.setModifiedDate(cMaster.getModifiedDate());
        customerTemp.setPrimaryContactPerson(cMaster.getPrimaryContactPerson());
        customerTemp.setRecordStatus(cMaster.getRecordStatus());
        return customerTemp;
    }

    @GetMapping("/")
    public String welcome(ModelMap mv) {
        mv.addAttribute("Hello User", "");
        return "home";
    }

    //----show all the customers---
//    @GetMapping("show")
//    public String getAll(ModelMap modelMap) {
//        modelMap.addAttribute("customers", customerService.getAllCustomers());
//        return "showTable";
//    }

    @GetMapping("403")
    public String error403Page() {
        return "ErrorPage";
    }

    @GetMapping(path = "maker")
    public String HelloMaker(ModelMap model) {
        model.addAttribute("ListOfCustomerFromTempTable", customerService.getAllCustomers());
        model.addAttribute("ListOfCustomerFromMasterTable", customerService.getAllCustomerMaster());
        return "maker";
    }

//**********ADD CUSTOMER*************

    @GetMapping("addCustomer")
    public String addCustomerGet(ModelMap mp) {
        CustomerBean customerFormBean = new CustomerBean();
        mp.addAttribute("customer", customerFormBean);
        return "RegistrationForm";
    }

    @PostMapping("addCustomer")
    public String addCustomerPost(@Valid @ModelAttribute(name = "customer") CustomerBean customerFormBean, BindingResult bindingResult, Principal principal, ModelMap map) {
        if (bindingResult.hasErrors()) {
            return "RegistrationForm";
        }
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateInString = date.format(now);

        CustomerTemp customersTemp = new CustomerTemp(customerFormBean.getCustomerCode(),
                customerFormBean.getCustomerName(), customerFormBean.getAddress1(),
                customerFormBean.getAddress2(), customerFormBean.getEmail(),
                customerFormBean.getContactNumber(), customerFormBean.getPrimaryContactPerson());

        customersTemp.setRecordStatus("N");
//        customersTemp.setCreatedBy(principal.getName());
        customersTemp.setCreatedBy("maker");
        customersTemp.setCreateDate(currentDateInString);
        customerService.addCustomer(customersTemp);
        map.addAttribute("customers", customerService.getAllCustomers());
//        System.out.println("call from add customer service");
        return "redirect:maker";
        //return "home_maker";
    }

    //**********UPDATE CUSTOMER*************

    @GetMapping("updateCustomer")
    public String getUpdatedCustomerFromTempTable(ModelMap mp, @RequestParam(name = "cid") Integer customerId) {

        CustomerTemp cTemp = customerService.getByCustomerId(customerId);
        CustomerBean customerFormBean = new CustomerBean(cTemp.getCid(), cTemp.getCustomerCode(),
                cTemp.getCustomerName(), cTemp.getAddress1(),
                cTemp.getAddress2(), cTemp.getEmail(),
                cTemp.getContactNumber(), cTemp.getPrimaryContactPerson());
        mp.addAttribute("customerBean", customerFormBean);
        mp.addAttribute("customerId", cTemp.getCid());

        return "updateCustomer";
    }

    @PostMapping("updateCustomer")
    public String postUpdatedCustomerFromTempTable(ModelMap mp, @ModelAttribute(name = "customerBean") CustomerBean c, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "updateCustomer";
        }
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateInString = date.format(now);

        CustomerTemp customersTemp = new CustomerTemp(c.getCustomerCode(),
                c.getCustomerName(), c.getAddress1(),
                c.getAddress2(), c.getEmail(),
                c.getContactNumber(), c.getPrimaryContactPerson());
        customersTemp.setRecordStatus("M");
        customersTemp.setModifiedBy("maker");
        customersTemp.setModifiedDate(currentDateInString);
        customersTemp.setCid(c.getCid());
        customerService.updateCustomer(customersTemp);

        return "redirect:maker";
    }

    //**********UPDATE CUSTOMER MASTER**********
    @GetMapping("updateCustomerMaster")
    public String updateCustomerMasterGet(ModelMap mp, @RequestParam(name = "cid") Integer customerId) {

        CustomerMaster customerMaster = customerService.getByCustomerIDFromMaster(customerId);
        CustomerTemp cTemp = changeCustomerMasterToCustomerTemp(customerMaster);
        CustomerBean customerFormBean = new CustomerBean(cTemp.getCid(), cTemp.getCustomerCode(),
                cTemp.getCustomerName(), cTemp.getAddress1(),
                cTemp.getAddress2(), cTemp.getEmail(),
                cTemp.getContactNumber(), cTemp.getPrimaryContactPerson());
        mp.addAttribute("customerBean", customerFormBean);
        mp.addAttribute("customerId", cTemp.getCid());

        return "updateCustomerMaster";
    }

    @PostMapping("updateCustomerMaster")
    public String updateCustomerMasterPost(ModelMap mp, @ModelAttribute(name = "customerBean") CustomerBean c, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "updateCustomerMaster";
        }

        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateInString = date.format(now);
        CustomerTemp customersTemp = new CustomerTemp(c.getCustomerCode(),
                c.getCustomerName(), c.getAddress1(),
                c.getAddress2(), c.getEmail(),
                c.getContactNumber(), c.getPrimaryContactPerson());
        customersTemp.setRecordStatus("M");
        customersTemp.setModifiedBy("maker");
        customersTemp.setModifiedDate(currentDateInString);
        customersTemp.setCid(c.getCid());
        customerService.saveCustomers(customersTemp);

        return "redirect:maker";
    }

    @GetMapping("deleteCustomer")
    public String deleteFromCustomerTemp(@RequestParam(name = "cid") Integer cid) {
        customerService.deleteCustomer(cid);
        return "redirect:maker";
    }

    @GetMapping("deleteCustomerMaster")
    public String deleteFromCustomerMaster(@RequestParam(name = "cid") Integer cid) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateInString = date.format(now);

        CustomerMaster customerMaster = customerService.getByCustomerIDFromMaster(cid);
        CustomerTemp cTemp = changeCustomerMasterToCustomerTemp(customerMaster);
        cTemp.setRecordStatus("D");
        cTemp.setModifiedBy("maker");
        cTemp.setModifiedDate(currentDateInString);
        cTemp.setCid(cTemp.getCid());
        customerService.saveCustomers(cTemp);
        return "redirect:maker";
    }
}
