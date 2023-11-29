package Practice6.Dog;

public class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void weight() {
        System.out.println("Средний вес лабрадора: " + 30 + "кг");
    }
}
