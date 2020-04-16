package com.ornl.demoapp;

public class Processor extends Item {
    private String speed;
    private String NumOfCores;

    public Processor(String model, String manufacturer, Double price, int quantity, String speed, String numOfCores) {
        super(model, manufacturer, price, quantity);
        this.speed = speed;
        NumOfCores = numOfCores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "speed='" + speed + '\'' +
                ", NumOfCores='" + NumOfCores + '\'' +
                '}';
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getNumOfCores() {
        return NumOfCores;
    }

    public void setNumOfCores(String numOfCores) {
        NumOfCores = numOfCores;
    }
}
