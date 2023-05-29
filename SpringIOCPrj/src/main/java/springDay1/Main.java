package springDay1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.function.Supplier;
import java.util.logging.Logger;

public class Main {
   // static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springDay1Beans.xml");
        Customer customer12 = (Customer) context.getBean("customer1");
        System.out.println(customer12);
        customer12.setCustomerName("Sunny");
        System.out.println(customer12);
        customer12.setCustomerName("Harsh Ranjan");
        System.out.println(customer12);
    //    log.info(customer12);
//      Customer customer13 = (Customer) context.getBean("customer1");
//        System.out.println(customer12);
    }


}