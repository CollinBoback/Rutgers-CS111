package com.company;

public class Main {

    public static void main(String[] args) {

        Burger hamburger = new Burger("Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        System.out.println(hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Lettuce", 5.00);
        System.out.println(healthyBurger.itemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();

        db.addHamburgerAddition1("Whatver h8r", 100.0);





	// write your code here
    }
}
