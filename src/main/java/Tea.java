package org.example;

public class Tea extends Beverage {
    public Tea() {
        name = "Tea";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}