
package com.ornl.demoapp;

/**
 * @author btomar (Bhuvanesh Tomar)
 * @version 1.0.0
 * Purpose: The main method for the PC Shop to enable adding a PC to shopping cart, displaying its contents, total cost and removing product from shopping cart
 */


public class ORNLDemoApp {
    private static ShoppingCart shoppingCart = new ShoppingCart();
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to the PC Shop!\n");
        Case case1 = new Case("ATX100","ASUS", 70.00, 1, "65W", new Dimensions(10,4,6));
        Monitor monitor1 = new Monitor("K242HQL", "Acer", 100.00, 1, 24, new Resolution(1024, 768));
        Processor processor1 = new Processor("Xeon", "Intel", 200.00, 1, "4.0GHz", "8");
        Motherboard motherboard1 = new Motherboard("Z65", "Gigabyte", 85.00, 1, 4, 2, "Intel");
        Memory memory1 = new Memory("1000", "Patriot", 200.00, 1, "32GB");
        Storage storage1 = new Storage("ST1000", "Seagate", 80.00, 1, "1TB", "HDD");

        PersonalComputer personalComputer = new PersonalComputer(case1, monitor1, motherboard1, processor1, memory1, storage1);
        shoppingCart.addProducts(personalComputer,1);
        shoppingCart.calculateTotal();
        System.out.println("After adding item");
        System.out.println(shoppingCart);
        shoppingCart.removeProducts(personalComputer, 1);
        System.out.println("After removing item");
        System.out.println(shoppingCart);


    }
}
