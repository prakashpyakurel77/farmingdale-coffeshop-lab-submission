public class OrderDriver {
    public static void main(String[] args) {

        // ---- FIRST ORDER ----
        Beverage drink1 = BeverageFactory.createBeverage("latte");

        drink1 = new BeverageBuilder(drink1)
                .setSize("Large")
                .setMilk("Oat")
                .setShots(2)
                .setSweetener("Honey")
                .build();

        Order order1 = new Order(drink1, new Order.TakeOut());
        order1.printOrder();


        // ---- SECOND ORDER ----
        Beverage drink2 = BeverageFactory.createBeverage("tea");

        drink2 = new BeverageBuilder(drink2)
                .setSize("Medium")
                .setSweetener("Sugar")
                .build();

        Order order2 = new Order(drink2, new Order.DineIn());
        order2.printOrder();
    }
}