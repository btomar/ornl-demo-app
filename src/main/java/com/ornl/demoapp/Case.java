package com.ornl.demoapp;

public class Case extends Item {
    private String powerSupply;
    private Dimensions dimensions;

    @Override
    public String toString() {
        return "Case{" +
                "powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }

    public Case(String model, String manufacturer, Double price, int quantity, String powerSupply, Dimensions dimensions) {
        super(model, manufacturer, price, quantity);
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
