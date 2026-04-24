package org.example;

public class Cappuccino extends Beverage {

    public Cappuccino() {
        name = "Cappuccino";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}