package com.springcore;
public class Restaurant {
    public void greetCustomer(int booking) {
        if(booking == 0)
            throw new ArithmeticException();
        System.out.println("Hello Customers");
    }

}