public abstract class Beverage {
    protected String name;
    protected String size;
    protected String milk;
    protected int shots;
    protected String sweetener;

    public abstract String getDescription();

    @Override
    public String toString() {
        return type + " | Size: " + size +
                ", Milk: " + milk +
                ", Shots: " + shots +
                ", Sweetener: " + sweetener;
    }
}