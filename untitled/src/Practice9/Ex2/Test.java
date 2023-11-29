package Practice9.Ex2;
//Реализовать интерфейс Priceable, имеющий метод getPrice(),
//возвращающий некоторую цену для объекта. Проверить работу для различных
//классов, сущности которых могут иметь цену.

public class Test {
    public static void main(String[] args) {
        Priceable priceable1 = createPriceable("Ноутбук", 59999.99, false);
        Priceable priceable2 = createPriceable("Сантехнические работы", 500.0, true);

        read(priceable1);
        read(priceable2);
    }

    static void read(Priceable priceable) {
        System.out.println("Цена " + priceable);
    }

    static Priceable createPriceable(String name, double pricePerHour, boolean isService) {
        if (isService) {
            return new Service(name, pricePerHour);
        } else {
            return new Product(name, pricePerHour);
        }
    }
}
