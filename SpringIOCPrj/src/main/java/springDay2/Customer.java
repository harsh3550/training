package springDay2;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Set;
@Component
public class Customer {
    private int customerId;
    private String customerName;
    private Double monthlyIncome;
    private String profession;
    private String designation;
    private String companyName;
    private List<String> phoneNumbers;

    private Set<String> emailAddress;

    private String dateOfBirth;

    private Address address;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setEmailAddress(Set<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", profession='" + profession + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", emailAddress=" + emailAddress +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address=" + address +
                '}';
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            String phoneNumber = phoneNumbers.get(i);
            if (!phoneNumber.startsWith("+91")) {
                phoneNumbers.set(i, "+91" + phoneNumber);
            }
        }
    }

    @PreDestroy
    public void destroy() {
        phoneNumbers.clear();
        emailAddress.clear();
    }
}