package com.ornl.demoapp;

public class Storage extends Item {
    private String capacity;
    private String type;

    public Storage(String model, String manufacturer, Double price, int quantity, String capacity, String type) {
        super(model, manufacturer, price, quantity);
        this.capacity = capacity;
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "capacity='" + capacity + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
