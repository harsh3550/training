package service;

import model.Customer;
import model.Policy;

import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    final Map<String, Customer> customerMap;
    PolicyService policyService;

    public CustomerService() {
        customerMap = new HashMap<>();
    }

    public Map<String, Customer> getCustomerMap() {
        return customerMap;
    }

    public void addCustomer(String name, int age, String gender, String address, String phone){
        Customer customer = new Customer(name, age, gender, address, phone);
        customerMap.put(name, customer);
    }

    public void assignPolicyToCustomer(String customerName, String policyName, int sumAssured, int years, String paymentCycle, Map<String, Policy> policiesMap){
        if(!policiesMap.containsKey(policyName)){
            System.out.println("Policy which is provided is not present");
            return;
        }
        if (!customerMap.containsKey(customerName)){
            System.out.println("Customer is Invalid");
            return;
        }
        Customer customer = customerMap.get(customerName);
        Policy policy = policiesMap.get(policyName);
        if (sumAssured > policy.getMaxSumAssured()) {
            System.out.println("Sum assured exceeds maximum limit.");
            return;
        }
        if (years > policy.getMaxNumberOfYears()) {
            System.out.println("Years exceeds maximum limit.");
            return;
        }
        double premium = sumAssured * policy.getPremiumRatePerYearPerLakh() / 100000;
        if (paymentCycle.equals("monthly")) {
            premium = premium / 12;
        } else if (paymentCycle.equals("quarterly")) {
            premium = premium / 4;
        }

        String policyNumber = "POL" + policy.getSchemeNumber() + "-" + customer.getPhoneNumber();
        customer.getPolicies().add(policyName);

        System.out.println("Policy assigned to " + customerName + " successfully with " + paymentCycle + " with premium " + premium);

    }

    public void viewAllPoliciesForCustomer(String customer){
        if(customerMap.containsKey(customer)){
            System.out.println(" Policies Detail on Customer ---");
            System.out.println(customerMap.get(customer).getPolicies());
        }
    }

    private boolean validation(String name, int age, String gender, String address, String phone){
        return false;
    }
}
