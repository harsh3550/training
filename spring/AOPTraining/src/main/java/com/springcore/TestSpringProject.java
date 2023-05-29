package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpringProject {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Restaurant restaurantObj = (Restaurant) context.getBean("proxy",Restaurant.class);
        System.out.println("RestaurantBean Initialised");
        ((AbstractApplicationContext)context).registerShutdownHook();
        try{
            restaurantObj.greetCustomer(0);  }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}