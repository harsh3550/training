package com.controller;
import com.dao.CustomerAgreementDAO;
import com.model.Agreement;
import com.model.Customer;
import com.model.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
public class CustomerAgreementController {
    @RequestMapping("/home")
    public String home(){
        return "CustomerAgreementHome";
    }
    @RequestMapping("/customerRegistration")
    public String getForm(Model theModel) {
        theModel.addAttribute("customer", new Customer());
        return "CustomerRegistrationForm";
    }
    @RequestMapping("/AfterRegistration")
    public String getFormParameters(@ModelAttribute("customer") Customer
                                            customer){
        CustomerAgreementDAO customerAgreementDAO = new
                CustomerAgreementDAO();
        if(customerAgreementDAO.insertCustomer(customer)) {
            System.out.println(customer);
            return "SuccessfulRegistration";
        }
        else
            return "Error";
    }
    @RequestMapping("/loanRegistration")
    public String getLoanForm(Model theModel) {
        theModel.addAttribute("agreement", new Agreement());
        return "LoanRegistrationForm";
    }
    @RequestMapping("/AfterLoanRegistration")
    public String getLoanObject(@ModelAttribute("agreement") Agreement
                                        loan){
        CustomerAgreementDAO customerAgreementDAO = new
                CustomerAgreementDAO();
        if(customerAgreementDAO.insertLoan(loan)) {
            return "SuccessfulLoanApplied";
        }
        else
            return "Error";
    }
    @RequestMapping(path="/getByCustomerId")
    public String getByCustomerID(@ModelAttribute("id")Value val, Model
            model){
        CustomerAgreementDAO customerAgreementDAO = new
                CustomerAgreementDAO();
        List<Object> customerDetails =
                customerAgreementDAO.searchByCustomerId(val.getId());
        model.addAttribute("customerDetails", customerDetails.toString());
        return "CustomerDetailsById";
    }
    @RequestMapping(path="/getByAgreementId")
    public String getByAgreementID(@ModelAttribute("id") Value val, Model
            model){
        CustomerAgreementDAO customerAgreementDAO = new
                CustomerAgreementDAO();
        List<Object> customerDetails =
                customerAgreementDAO.searchByAgreementId(val.getId());
        model.addAttribute("customerDetails", customerDetails.toString());
        return "CustomerDetailsByAgreementId";
    }
    @RequestMapping("/logout")
    public String logout(){
        return "logout";
    }
}