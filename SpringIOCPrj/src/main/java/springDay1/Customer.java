package springDay1;

//import java.util.List;
import java.util.List;
import java.util.Set;

public class Customer {
    private int customerId;
    private String customerName;
    private Double monthlyIncome;
    private String profession;
    private String designation;
    private String companyName;

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

    public Customer(int customerId, String customerName, Double monthlyIncome, String profession, String designation, String companyName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.monthlyIncome = monthlyIncome;
        this.profession = profession;
        this.designation = designation;
        this.companyName = companyName;
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
                '}';
    }
//  private List<String> phoneNumbers;

  //private Set<String> emailAddressSet;

//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setMonthlyIncome(Double monthlyIncome) {
//        this.monthlyIncome = monthlyIncome;
//    }
//
//    public void setProfession(String profession) {
//        this.profession = profession;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }

 //   public void setPhoneNumbers(List<String> phoneNumbers) {
   //     this.phoneNumbers = phoneNumbers;
 //   }

//    public void setEmailAddressSet(Set<String> emailAddressSet) {
//        this.emailAddressSet = emailAddressSet;
//    }


}

//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setMonthlyIncome(Double monthlyIncome) {
//        this.monthlyIncome = monthlyIncome;
//    }
//
//    public void setProfession(String profession) {
//        this.profession = profession;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }

//    @Override
//    public String toString() {
//        return "Customer{" +
//                "customerId=" + customerId +
//                ", customerName='" + customerName + '\'' +
//                ", monthlyIncome=" + monthlyIncome +
//                ", profession='" + profession + '\'' +
//                ", designation='" + designation + '\'' +
//                ", companyName='" + companyName + '\'' +
//                '}';
//    }
//}
