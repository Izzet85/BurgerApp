package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "sausage & bacon", 15.00, "white");
        super.addHamburgerAddition1("chips",2.75);
        super.addHamburgerAddition2("chips",1.81);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add this item");    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add this item");    }


    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add this item");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add this item");
    }
}
