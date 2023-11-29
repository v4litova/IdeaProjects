package Practice19;
//Написать класс, который умеет хранить в себе массив любых
//типов данных (int, long etc.).

public class Ex2<T> {
    private T[] array;

    public Ex2(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void printArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Пример использования GenericArray с разными типами данных
        Integer[] intArray = {1, 2, 3, 4, 5};
        Ex2<Integer> intGenericArray = new Ex2<>(intArray);
        intGenericArray.printArray();

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Ex2<Double> doubleGenericArray = new Ex2<>(doubleArray);
        doubleGenericArray.printArray();

        String[] stringArray = {"one", "two", "three", "four", "five"};
        Ex2<String> stringGenericArray = new Ex2<>(stringArray);
        stringGenericArray.printArray();
    }
}
