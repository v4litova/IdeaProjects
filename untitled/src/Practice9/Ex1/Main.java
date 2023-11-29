package Practice9.Ex1;
//Создать интерфейс Nameable, с методом getName(), возвращающим
     //   имя объекта, реализующего интерфейс. Проверить работу для различных
      //  объектов (например, можно создать классы, описывающие разные сущности,
       // которые могут иметь имя: планеты, машины, животные и т. д.).

public class Main {
    public static void main(String[] args) {
        Nameable car = createNameable("Audi", true);
        car.print();

        Nameable planet = createNameable("Mars", false);
        planet.print();
    }

        static void read(Nameable nameable) {
            System.out.println("Имя объекта: " + nameable.getName());
        }

        static Nameable createNameable(String name, boolean isCar) {
        if (isCar) {
            return new Car(name);
        } else {
            return new Planet(name);
        }
    }
}