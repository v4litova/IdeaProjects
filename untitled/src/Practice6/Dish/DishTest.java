package Practice6.Dish;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", 20, "Глубокая");
        Cup cup = new Cup("Стекло", 10, 250);

        plate.displayInfo();
        System.out.println();
        cup.displayInfo();
    }
}
