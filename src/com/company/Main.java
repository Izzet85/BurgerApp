package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic","sausage",3.56,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",0.27);
        hamburger.addHamburgerAddition2("lettuce",0.75);
        hamburger.addHamburgerAddition3("cheese",1.12);
        System.out.println("Total burger price is " +   hamburger.itemizeHamburger());


        HealthyBurger healthyburger = new HealthyBurger("bacon",5.60);
        healthyburger.addHamburgerAddition1("Egg",5.43);
        healthyburger.addHamburgerAddition2("Lentils",3.42);
        healthyburger.addHealthAddition1("lettuce",2.50);
        healthyburger.itemizeHamburger();

        System.out.println("total hamburger price is " + healthyburger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        System.out.println();



    }
}
