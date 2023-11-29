package Practice9.Ex2;

// Создаем интерфейс Priceable
interface Priceable {
    double getPrice();
}

// Создаем классы, реализующие интерфейс Priceable, для различных сущностей

class Product implements Priceable {
    private String name;
    private double priceInRubles;

    public Product(String name, double priceInRubles) {
        this.name = name;
        this.priceInRubles = priceInRubles;
    }

    @Override
    public double getPrice() {
        return priceInRubles;
    }

    @Override
    public String toString() {
        return name + " - " + priceInRubles + " руб.";
    }
}

class Service implements Priceable {
    private String serviceName;
    private double pricePerHourInRubles;

    public Service(String serviceName, double pricePerHourInRubles) {
        this.serviceName = serviceName;
        this.pricePerHourInRubles = pricePerHourInRubles;
    }

    @Override
    public double getPrice() {
        return pricePerHourInRubles;
    }

    @Override
    public String toString() {
        return serviceName + " - " + pricePerHourInRubles + " руб. в час";
    }
}
