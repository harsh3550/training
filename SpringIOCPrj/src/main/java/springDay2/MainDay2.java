package springDay2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springDay2Beans.xml");
        Customer details = (Customer) context.getBean("phone1");
        System.out.println(details);
    }
}