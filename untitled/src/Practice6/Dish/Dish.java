package Practice6.Dish;

public abstract class Dish {
    protected String material;
    protected int diameter;
    public Dish(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }
    public abstract void displayInfo();
}
