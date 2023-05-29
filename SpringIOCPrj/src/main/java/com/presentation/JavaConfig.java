package com.presentation;
import com.service.Customer;
import com.service.CustomerDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import java.sql.Date;
import java.util.Scanner;
@Configuration
@ComponentScan("com")
public class JavaConfig {
    Scanner sc = new Scanner(System.in);
    @Bean("customer1")
    public Customer getCustomer(){
        Customer customer1 = new Customer();
        customer1.setCustomerId("C991");
        customer1.setFirstName("Siddhatha");
        customer1.setLastName("Bhunia");
        customer1.setGender("M");
        customer1.setDateOfBirth(Date.valueOf("2000-12-21"));
        customer1.setContactNumber(1064483180);
        customer1.setEmailAddress("siddhardkbhunia1@gmail.com");
        customer1.setMonthlyIncome(50000);
        customer1.setProfession("Betting");
        customer1.setTotalMonthlyExpenses(30000);
        customer1.setDesignation("Pro");
        customer1.setCompanyName("Dream11");
        return customer1;
    }
    @Bean("customerDao")
// @Qualifier
    public CustomerDAO getCustomerDAO(){
        CustomerDAO dao = new CustomerDAO();
        return dao;
    }
    @Bean("customer2")
    @Lazy
    public Customer getCust2(){
        Customer customer2 = new Customer();
        System.out.println("Enter Id : ");
        String id = sc.nextLine();
        customer2.setCustomerId(id);
        System.out.println("Enter fname : ");
        String fname = sc.nextLine();
        customer2.setFirstName(fname);
        System.out.println("Enter lname : ");
        String lname = sc.nextLine();
        customer2.setLastName(lname);
        System.out.println("Enter gender : ");
        String gender = sc.nextLine();
        customer2.setGender(gender);
        System.out.println("Enter dob : ");
        String dob = sc.nextLine();
        customer2.setDateOfBirth(Date.valueOf(dob));
        System.out.println("Enter contactNumber : ");
        long number = sc.nextLong();
        customer2.setContactNumber(number);
        System.out.println("Enter email : ");
        String mail = sc.nextLine();
        customer2.setEmailAddress(mail);
        System.out.println("Enter monthlyIncome : ");
        double income = sc.nextDouble();
        customer2.setMonthlyIncome(income);
        System.out.println("Enter profession : ");
        String proff = sc.nextLine();
        customer2.setProfession(proff);
        System.out.println("Enter expense : ");
        double expense = sc.nextDouble();
        customer2.setTotalMonthlyExpenses(expense);
        System.out.println("Enter designation : ");
        String desig = sc.nextLine();
        customer2.setDesignation(desig);
        System.out.println("Enter company : ");
        String comp = sc.nextLine();
        customer2.setCompanyName(comp);
        return customer2;
    }
}
