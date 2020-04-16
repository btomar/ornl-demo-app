package com.ornl.demoapp;

public class Monitor extends Item {

    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, Double price, int quantity, int size, Resolution nativeResolution) {
        super(model, manufacturer,price, quantity );
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", nativeResolution=" + nativeResolution +
                '}';
    }
}
