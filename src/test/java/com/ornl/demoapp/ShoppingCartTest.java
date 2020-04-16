package com.ornl.demoapp;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;


public class ShoppingCartTest extends TestCase {

    ShoppingCart shoppingCart = new ShoppingCart();
    Case case1 = new Case("ATX100","ASUS", 70.00, 1, "65W", new Dimensions(10,4,6));
    Monitor monitor1 = new Monitor("K242HQL", "Acer", 100.00, 1, 24, new Resolution(1024, 768));
    Processor processor1 = new Processor("Xeon", "Intel", 200.00, 1, "4.0GHz", "8");
    Motherboard motherboard1 = new Motherboard("Z65", "Gigabyte", 85.00, 1, 4, 2, "Intel");
    Memory memory1 = new Memory("1000", "Patriot", 200.00, 1, "32GB");
    Storage storage1 = new Storage("ST1000", "Seagate", 80.00, 1, "1TB", "HDD");

    PersonalComputer personalComputer = new PersonalComputer(case1, monitor1, motherboard1, processor1, memory1, storage1);


    @org.junit.jupiter.api.Test
    public void testAddProducts() throws Exception {
        int returnValue = shoppingCart.addProducts(personalComputer,1);
        assertEquals(returnValue, 0);
    }

    @org.junit.jupiter.api.Test
    public void testRemoveProducts() throws Exception {
        int returnValue = shoppingCart.removeProducts(personalComputer,1);
        assertEquals(returnValue, 0);
    }

    @org.junit.jupiter.api.Test
    public void testCalculateTotal() throws Exception {
        shoppingCart.addProducts(personalComputer,1);
        assertNotNull(shoppingCart.calculateTotal());
    }
}