public class Latte extends Beverage {
    public Latte() {
        name = "Latte";
    }

    @Override
    public double cost() {
        return 3.5;
    }
}