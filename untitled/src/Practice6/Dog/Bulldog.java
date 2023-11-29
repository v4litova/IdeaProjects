package Practice6.Dog;

public class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void weight() {
        System.out.println("Средний вес бульдога: " + 12 + "кг");
    }
}
