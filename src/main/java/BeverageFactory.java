package org.example;

public class BeverageFactory {

    public static Beverage createBeverage(String type) {
        switch(type.toLowerCase()) {
            case "coffee": return new Coffee();
            case "latte": return new Latte();
            case "cappuccino": return new Cappuccino();
            case "tea": return new Tea();
            default: throw new IllegalArgumentException("Invalid type");
        }
    }
}