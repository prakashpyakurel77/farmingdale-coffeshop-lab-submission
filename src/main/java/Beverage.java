public abstract class Beverage implements BeverageCost {
    protected String name;
    protected String size;
    protected String milk;
    protected int shots;
    protected String sweetener;

    public abstract double cost();

    public String getDescription() {
        return toString();
    }

    @Override
    public String toString() {
        return name + " | Size: " + size +
                ", Milk: " + milk +
                ", Shots: " + shots +
                ", Sweetener: " + sweetener;
    }
}