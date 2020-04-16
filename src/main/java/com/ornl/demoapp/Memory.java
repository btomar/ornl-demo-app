package com.ornl.demoapp;

public class Memory extends Item {
    private String capacity;

    public Memory(String model, String manufacturer, Double price, int quantity, String capacity) {
        super(model, manufacturer, price, quantity);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity='" + capacity + '\'' +
                '}';
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
