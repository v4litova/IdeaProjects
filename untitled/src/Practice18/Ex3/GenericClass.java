package Practice18.Ex3;
import java.io.Serializable;

//Наложить ограничения на параметры типа: T должен реализовать
//интерфейс Comparable (классы оболочки, String), V должен реализовать
//интерфейс Serializable и расширять класс Animal, K
public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T genericParameter1;
    private V genericParameter2;
    private K genericParameter3;

    public GenericClass(T param1, V param2, K param3) {
        this.genericParameter1 = param1;
        this.genericParameter2 = param2;
        this.genericParameter3 = param3;
    }

    public T getGenericParameter1() {
        return genericParameter1;
    }

    public V getGenericParameter2() {
        return genericParameter2;
    }

    public K getGenericParameter3() {
        return genericParameter3;
    }
    public void displayClassNames() {
        System.out.println(genericParameter1 + " (class " + genericParameter1.getClass().getName() + ")");
        System.out.println(genericParameter2 + " (class " + genericParameter2.getClass().getName() + ")");
        System.out.println(genericParameter3 + " (class " + genericParameter3.getClass().getName() + ")");
    }

    public static void main(String[] args) {
        GenericClass<Integer, Dog, String> example = new GenericClass<>(10, new Dog(), "Hello");
        example.displayClassNames();
        example.getGenericParameter2().makeSound();
        System.out.println("Color: " + example.getGenericParameter2().getColor());
        System.out.println("Weight: " + example.getGenericParameter2().getWeight());
    }
}

