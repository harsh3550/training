package service;

import model.Customer;
import model.Policy;

import java.util.HashMap;
import java.util.Map;

public class InsuranceCompanyService {

    PolicyService policyService;
    CustomerService customerService;
    public InsuranceCompanyService() {
        policyService = new PolicyService();
        customerService = new CustomerService();
    }

    public void addPolicy(String policyName, String policyType, int maxYears, double premiumRate, int maxSumAssured){
       policyService.addPolicy(policyName, policyType, maxYears, premiumRate, maxSumAssured);
    }
    public void addCustomer(String name, int age, String gender, String address, String phone){
        customerService.addCustomer(name, age, gender, address,phone);
    }

    public void assignPolicyToCustomer(String customerName, String policyName, int sumAssured, int years, String paymentCycle){
        Map<String, Policy> policyMap = policyService.getPoliciesMap();
        customerService.assignPolicyToCustomer(customerName, policyName, sumAssured, years, paymentCycle, policyMap);
    }

    public void viewAllPolicies(){
        policyService.viewAllPolicies();
    }

    public void viewAllPoliciesForCustomer(String customer){
        customerService.viewAllPoliciesForCustomer(customer);
    }

}
