package org.example;

public class Coffee extends Beverage {
    public Coffee() {
        name = "Coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}