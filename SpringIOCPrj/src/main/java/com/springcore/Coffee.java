package com.springcore;
import org.springframework.stereotype.Component;
@Component("coffeeBean")

public class Coffee implements IHotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Dear customer, we are preparing coffee for you!!");
    }
}
