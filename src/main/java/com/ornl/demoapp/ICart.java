package com.ornl.demoapp;

public interface ICart {
    int addProducts(PersonalComputer personalComputer, int quantity) throws Exception;
    int removeProducts(PersonalComputer personalComputer, int quantity) throws Exception;
    String calculateTotal();
}
