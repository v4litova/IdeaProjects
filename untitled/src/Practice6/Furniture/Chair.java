package Practice6.Furniture;

public class Chair extends Furniture {
    public Chair(String name, String material, double price) {
        super(name, material, price);
    }
    @Override
    public void form() {
        System.out.println("Стул квадратный");
    }
}
