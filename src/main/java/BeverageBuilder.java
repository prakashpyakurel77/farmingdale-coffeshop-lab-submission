package org.example;

public class BeverageBuilder {
    private Beverage beverage;

    public BeverageBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageBuilder setSize(String size) {
        beverage.size = size;
        return this;
    }

    public BeverageBuilder setMilk(String milk) {
        beverage.milk = milk;
        return this;
    }

    public BeverageBuilder setShots(int shots) {
        beverage.shots = shots;
        return this;
    }

    public BeverageBuilder setSweetener(String sweetener) {
        beverage.sweetener = sweetener;
        return this;
    }

    public Beverage build() {
        return beverage;
    }
}