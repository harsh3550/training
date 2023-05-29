package com.springcore;
import org.springframework.stereotype.Component;


@Component("soupBean")
public class Soup implements IHotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Dear customer, we are preparing Soup for you!!");
    }
}
