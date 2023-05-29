package com.controller;
import com.dao.CustomerAgreementDAO;
import com.model.Agreement;
import com.model.Customer;
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
    public String getFormParameters(@ModelAttribute("customer")
                                    Customer customer){
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
    public String getLoanObject(@ModelAttribute("agreement")
                                Agreement loan){
        CustomerAgreementDAO customerAgreementDAO = new
                CustomerAgreementDAO();
        if(customerAgreementDAO.insertLoan(loan)) {
            return "SuccessfulLoanApplied";
        }
        else
            return "Error";
    }
    @RequestMapping(path="/getByCustomerId", method =
            RequestMethod.POST)
    public String getByCustomerID(@RequestParam("id") String
                                          customer_id, Model model){
        CustomerAgreementDAO customerAgreementDAO = new
                CustomerAgreementDAO();
        List<Object> customerDetails =
                customerAgreementDAO.searchByCustomerId(customer_id);
        model.addAttribute("customerDetails",
                customerDetails.toString());
        return "CustomerDetailsById";
    }
    @RequestMapping(path="/getByAgreementId", method =
            RequestMethod.POST)
    public String getByAgreementID(@RequestParam("id") String
                                           agreement_id, Model model){
        CustomerAgreementDAO customerAgreementDAO = new
                CustomerAgreementDAO();
        List<Object> customerDetails =
                customerAgreementDAO.searchByAgreementId(agreement_id);
        model.addAttribute("customerDetails",
                customerDetails.toString());
        return "CustomerDetailsByAgreementId";
    }
}
