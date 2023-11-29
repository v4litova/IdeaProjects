package Practice9.Ex1;
// Создаем интерфейс Nameable
interface Nameable {
    String getName();

    void print();
}

// Создаем классы, реализующие интерфейс Nameable, для разных сущностей

class Planet implements Nameable {
    private String name;
    public String getName() {
        return name;
    }
    public Planet(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Планета " + name);
    }

}

class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public void print() {
        System.out.println("Машина " + name);
    }
}

class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public void print() {
        System.out.println("Животное " + name);
    }
}

