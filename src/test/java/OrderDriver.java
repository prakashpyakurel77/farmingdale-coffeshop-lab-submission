
package org.example;
public class OrderDriver {
    public static void main(String[] args) {

        // 1. Create beverage using Factory
        Beverage drink1 = BeverageFactory.createBeverage("latte");

        // 2. Customize using Builder
        drink1 = new BeverageBuilder(drink1)
                .setSize("Large")
                .setMilk("Oat")
                .setShots(2)
                .setSweetener("Honey")
                .build();

        // 3. Create Order
        Order order1 = new Order(drink1, "Takeaway");

        // 4. Print Order
        order1.printOrder();


        // ---- SECOND ORDER (show variety) ----

        Beverage drink2 = BeverageFactory.createBeverage("tea");

        drink2 = new BeverageBuilder(drink2)
                .setSize("Medium")
                .setSweetener("Sugar")
                .build();

        Order order2 = new Order(drink2, "Dine-in");
        order2.printOrder();
    }
}