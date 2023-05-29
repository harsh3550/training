package springDay3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //CustomerConfig.class);
       context.scan("springDay3");
       context.refresh();
        Customer cus = (Customer) context.getBean("customerBean");
        System.out.println(cus);
    }
}
