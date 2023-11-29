package Practice6.Dish;

public class Plate extends Dish {
    private String type; // Вместимость в мл
    public Plate(String material, int diameter, String type) {
        super(material, diameter);
        this.type = type;
    }
    @Override
    public void displayInfo() {
        System.out.println("Тарелка:");
        System.out.println("Материал: " + super.material);
        System.out.println("Диаметр: " + super.diameter + " см");
        System.out.println("Тип: " + type);
    }
}
