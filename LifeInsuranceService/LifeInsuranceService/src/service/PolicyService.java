package service;

import model.Policy;

import java.util.HashMap;
import java.util.Map;

public class PolicyService {
    final Map<String, Policy> policiesMap;
    Long policyNumber;
    Long DEFAULT = 1L;

    public PolicyService() {
        policiesMap = new HashMap<>();
        policyNumber = DEFAULT;
    }

    public Map<String, Policy> getPoliciesMap() {
        return policiesMap;
    }
    public void addPolicy(String policyName, String policyType, int maxYears, double premiumRate, int maxSumAssured){
        Policy policy = new Policy(policyNumber, policyName, policyType, maxYears, premiumRate, maxSumAssured);
        if(policiesMap.containsKey(policyName)){
            System.out.println("This Policy name is already exist is the System.");
        }
        policiesMap.put(policyName, policy);
        policyNumber++;
    }

    public void viewAllPolicies(){
        System.out.println("List of all policies:");
        for (Policy policy : policiesMap.values()) {
            System.out.println(policy.toString());
        }
    }

}
