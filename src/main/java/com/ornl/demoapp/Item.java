package com.ornl.demoapp;

/**
 * Parent Class from which most of the components inherit
 */

public class Item {
    private String model;
    private String manufacturer;
    private Double price;
    private int quantity;

    /**
     * Constructor
     * @param model
     * @param manufacturer
     * @param price
     * @param quantity
     */
    public Item(String model, String manufacturer, Double price, int quantity) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
