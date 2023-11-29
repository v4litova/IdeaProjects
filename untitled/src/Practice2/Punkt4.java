package Practice2;

import java.util.Arrays;
import java.util.Random;

public class Punkt4 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;

        // Создаем и заполняем массив случайными целыми числами от 0 до 99
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}
