package Practice6.Dish;

public class Cup extends Dish {
    private int capacity; // Вместимость в мл

    public Cup(String material, int diameter, int capacity) {
        super(material, diameter);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Чашка:");
        System.out.println("Материал: " + super.material);
        System.out.println("Диаметр: " + super.diameter + " см");
        System.out.println("Вместимость: " + capacity + " мл");
    }
}
