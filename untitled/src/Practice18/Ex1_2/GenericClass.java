package Practice18.Ex1_2;

/////////////Practice22.Ex1////////////////
//Создать обобщенный класс с тремя параметрами (T, V, K).
public class GenericClass<T, V, K> {
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
//////////Practice22.Ex1.Ex2/////////////
//Создать метод, выводящий на консоль имена
//классов для трех переменных класса.
    public void displayClassNames() {
        System.out.println(genericParameter1 + " (class " + genericParameter1.getClass().getName() + ")");
        System.out.println(genericParameter2 + " (class " + genericParameter2.getClass().getName() + ")");
        System.out.println(genericParameter3 + " (class " + genericParameter3.getClass().getName() + ")");
    }

    public static void main(String[] args) {
        // Пример использования класса с параметрами типов Integer, String, Double
        GenericClass<Integer, String, Double> example = new GenericClass<>(10, "Hello", 3.14);
        example.displayClassNames();
    }
}

