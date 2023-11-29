package Practice6.Dog;

public class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Смельчак", 3);
        Bulldog bulldog = new Bulldog("Шарик", 5);

        System.out.println("Информация о лабрадоре:");
        labrador.displayInfo();
        labrador.weight();
        System.out.println();
        System.out.println("Информация о бульдоге:");
        bulldog.displayInfo();
        bulldog.weight();
    }
}
