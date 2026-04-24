public class Order {
    private Beverage beverage;
    private String orderType; // Dine-in, Takeaway

    public Order(Beverage beverage, String orderType) {
        this.beverage = beverage;
        this.orderType = orderType;
    }

    public void printOrder() {
        System.out.println("Order Type: " + orderType);
        System.out.println("Drink: " + beverage.getDescription());
        System.out.println("Total: $" + beverage.cost());
    }
}