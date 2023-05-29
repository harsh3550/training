package model;

public class Policy {
    private Long schemeNumber;
    private String policyName;
    private String policyType;
    private int maxNumberOfYears;
    private double premiumRatePerYearPerLakh;
    private double maxSumAssured;

    public Policy(Long schemeNumber, String policyName, String policyType, int maxNumberOfYears, double premiumRatePerYearPerLakh, double maxSumAssured) {
        this.schemeNumber = schemeNumber;
        this.policyName = policyName;
        this.policyType = policyType;
        this.maxNumberOfYears = maxNumberOfYears;
        this.premiumRatePerYearPerLakh = premiumRatePerYearPerLakh;
        this.maxSumAssured = maxSumAssured;
    }

    public Long getSchemeNumber() {
        return schemeNumber;
    }

    public void setSchemeNumber(Long schemeNumber) {
        this.schemeNumber = schemeNumber;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public int getMaxNumberOfYears() {
        return maxNumberOfYears;
    }

    public void setMaxNumberOfYears(int maxNumberOfYears) {
        this.maxNumberOfYears = maxNumberOfYears;
    }

    public double getPremiumRatePerYearPerLakh() {
        return premiumRatePerYearPerLakh;
    }

    public void setPremiumRatePerYearPerLakh(double premiumRatePerYearPerLakh) {
        this.premiumRatePerYearPerLakh = premiumRatePerYearPerLakh;
    }

    public double getMaxSumAssured() {
        return maxSumAssured;
    }

    public void setMaxSumAssured(double maxSumAssured) {
        this.maxSumAssured = maxSumAssured;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "schemeNumber=" + schemeNumber +
                ", policyName='" + policyName + '\'' +
                ", policyType='" + policyType + '\'' +
                ", maxNumberOfYears=" + maxNumberOfYears +
                ", premiumRatePerYearPerLakh=" + premiumRatePerYearPerLakh +
                ", maxSumAssured=" + maxSumAssured +
                '}';
    }
}
