package Practice2;

public class Punkt1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        System.out.println("Сумма элементов массива (for): " + sum1);

        int sum2 = 0;
        int j = 0;
        while (j < arr.length) {
            sum2 += arr[j];
            j++;
        }
        System.out.println("Сумма элементов массива (while): " + sum2);


        int sum3 = 0;
        int a = 0;
        do {
            sum3 += arr[a];
            a++;
        } while (a < arr.length);
        System.out.println("Сумма элементов массива (do-while): " + sum3);
    }
}
