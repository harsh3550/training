package com.presentation;
import com.service.Customer;
import com.service.CustomerDAO;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.presentation.JavaConfig;
import
        org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.sql.Date;
import java.util.Scanner;
public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
// context.scan("com");
// context.refresh();
        CustomerDAO dao = (CustomerDAO)context.getBean("customerDao");
        Customer customer1 = (Customer)context.getBean("customer1");
        System.out.println(customer1);
        log.info("Registering....");
        log.info(dao.registerCustomer(customer1));
        Customer customer2 = (Customer)context.getBean("customer2");
        log.info("Updating...");
        log.info(dao.updateCustomer(customer2));
        log.info("Getting all customers...");
        log.info(dao.getAllCustomers());
        log.info("Getting customer with id...");
        String customerId = sc.nextLine();
        log.info(dao.getCustomer(customerId));
        log.info("Getting customer by Name...");
        String fname = sc.nextLine();
        log.info(dao.getCustomersByName(fname));
        log.info("Deleting....");
        String customId = sc.nextLine();
        log.info(dao.deleteCustomer(customId));
    }
}
