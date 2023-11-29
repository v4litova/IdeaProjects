package Practice6.Furniture;

public class Table extends Furniture {
    public Table(String name, String material, double price) {
        super(name, material, price);
    }
    @Override
    public void form() {
        System.out.println("Стол круглый");
    }
}
