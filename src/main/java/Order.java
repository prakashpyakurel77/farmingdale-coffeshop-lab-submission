public class Order {
    private Beverage beverage;
    private OrderStrat strat;

    public interface OrderStrat {
        void process();
    }

    public static class DineIn implements OrderStrat {
        public void process() {
            System.out.println("Serving inside the shop");
        }
    }

    public static class TakeOut implements OrderStrat {
        public void process() {
            System.out.println("Serving outside the shop");
        }
    }

    public Order(Beverage beverage, OrderStrat strat) {
        this.beverage = beverage;
        this.strat = strat;
    }

    public void printOrder() {
        System.out.println("Drink: " + beverage.getDescription());
        System.out.println("Total: $" + beverage.cost());
        strat.process();
    }
}