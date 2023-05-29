package springDay3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Configuration
@ComponentScan
public class CustomerConfig {

   @Bean("customerBean")
    public Customer customer() {
        Customer cus = new Customer();
        cus.setCustomerId(101);
        cus.setCustomerName("Harsh");
        cus.setMonthlyIncome(36671.0);
        cus.setProfession("SoftwareEngineer");
        cus.setDesignation("ASE");
        cus.setCustomerName("Nucleus Software");

        List<String> mobNo = new ArrayList<>(Arrays.asList("7274088610","887867359","+918051228803"));
        cus.setPhoneNumbers(mobNo);
        cus.setEmailAddress(Set.of("harsh3550@gmail.com","raushan2343@gmail.com","amlan2031@gmail.com"));
        cus.setAddress(new Address());
        cus.setDateOfBirth("25-07-2001");
        return cus;
    }

    @Bean("addressBean")
    public Address address(){
       Address add = new Address();
       add.setAddressId(1);
       add.setAddressLine1("pindaruch");
       add.setAddressLine2("muhammadpur");
       add.setCity("Darbhnaga");
       add.setZip(847306);
       return add;
    }
}
