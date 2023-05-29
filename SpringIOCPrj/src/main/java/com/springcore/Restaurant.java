package com.springcore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("restaurantBean")
public class Restaurant {
    @Autowired
    @Qualifier("coffeeBean")
    IHotDrink hotDrink;
    /*	public Restaurant(iHotDrink hotDrink) { //autowired with Qualifier
        this.hotDrink = hotDrink;
    } */
	/*
  @Autowired
	public Restaurant(Tea hotDrink) { //constructor/Setter autowired
		this.hotDrink = hotDrink;
	} */
    public Restaurant() {
    }
    public void serveHotDrink() {
        hotDrink.prepareHotDrink();
    }
}