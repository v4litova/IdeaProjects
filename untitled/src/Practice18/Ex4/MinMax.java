package Practice18.Ex4;

public class MinMax<T extends Comparable<T>> {
    private T[] array;
    // Конструктор класса, принимающий массив элементов
    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return min;
    }

    public T findMax() {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Пример использования класса с массивом типа Integer
        Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());

        // Пример использования класса с массивом типа Double
        Double[] doubleArray = {3.14, 2.71, 1.0, 4.0, 5.0};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Min: " + doubleMinMax.findMin());
        System.out.println("Max: " + doubleMinMax.findMax());
    }
}

