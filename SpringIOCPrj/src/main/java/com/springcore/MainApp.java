package com.springcore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.springcore");
        context.refresh();
        Restaurant obj = (Restaurant) context.getBean("restaurantBean");
        obj.serveHotDrink();
        context.close();
    }
}