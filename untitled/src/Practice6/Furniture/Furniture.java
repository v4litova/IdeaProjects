package Practice6.Furniture;

public abstract class Furniture {
    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }
    public abstract void form();
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Материал: " + material);
        System.out.println("Цена: " + price + " руб.");
    }
}
