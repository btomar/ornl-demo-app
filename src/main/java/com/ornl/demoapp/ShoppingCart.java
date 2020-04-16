package com.ornl.demoapp;

import java.util.HashMap;
import java.util.Map;

/**
 * Main Shopping Cart implementation with add remove methods
 */

public class ShoppingCart implements ICart {
    private final Map<PersonalComputer, Integer> list;

    public ShoppingCart() {
        this.list = new HashMap<>();;
    }

    /**
     *
     * @return String
     */

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "list=" + list +
                '}';
    }

    /**
     *
     * @param personalComputer
     * @param quantity
     * @return Integer
     * @throws Exception
     */

    @Override
    public int addProducts(PersonalComputer personalComputer, int quantity) throws Exception {
        if (personalComputer != null && quantity > 0) {
            int inCart = list.getOrDefault(personalComputer, 0);
            list.put(personalComputer, inCart + quantity);
            return inCart;

        }
        return 0;
    }

    /**
     *
     * @param personalComputer
     * @param quantity
     * @return Integer
     * @throws Exception
     */

    @Override
    public int removeProducts(PersonalComputer personalComputer, int quantity) throws Exception {

            // check if we already have the item in the cart
            int inCart = list.getOrDefault(personalComputer, 0);
            int newQuantity = inCart - quantity;

            if(newQuantity > 0) {
                list.put(personalComputer, newQuantity);
                return quantity;
            } else if(newQuantity == 0) {
                list.remove(personalComputer);
                return quantity;
            }

        return 0;
    }

    /**
     * Calculates total cost of items in cart
     * @return String
     */
    @Override
    public String calculateTotal() {
        String s = "\nShopping cart contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<PersonalComputer, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getTotalPrice() * item.getValue();
        }
        //String cost = Double.toString(totalCost);
        System.out.println("Total cost of the PC is "+ totalCost);

        return s + "Total cost " + totalCost;
    }
}
