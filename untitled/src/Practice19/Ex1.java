package Practice19;

import java.util.Arrays;
import java.util.List;
//Написать метод для конвертации массива строк/чисел в список.
public class Ex1 {
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        // Пример использования метода с массивом строк
        String[] stringArray = {"apple", "banana", "orange"};
        List<String> stringList = convertArrayToList(stringArray);

        System.out.println("List of Strings: " + stringList);

        // Пример использования метода с массивом чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);

        System.out.println("List of Integers: " + intList);
    }
}
