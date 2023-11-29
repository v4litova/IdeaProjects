package Practice19;

//Реализовать метод, который возвращает любой элемент массива по индексу.
public class Ex3<T> {
    private T[] array;

    public Ex3(T[] array) {
        this.array = array;
    }

    public T getElementAtIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        return array[index];
    }

    public static void main(String[] args) {
        // Пример использования GenericArray с разными типами данных
        Integer[] intArray = {1, 2, 3, 4, 5};
        Ex3<Integer> intGenericArray = new Ex3<>(intArray);
        System.out.println("Element at index 2: " + intGenericArray.getElementAtIndex(2));

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Ex3<Double> doubleGenericArray = new Ex3<>(doubleArray);
        System.out.println("Element at index 3: " + doubleGenericArray.getElementAtIndex(3));

        String[] stringArray = {"one", "two", "three", "four", "five"};
        Ex3<String> stringGenericArray = new Ex3<>(stringArray);
        System.out.println("Element at index 4: " + stringGenericArray.getElementAtIndex(4));
    }
}
