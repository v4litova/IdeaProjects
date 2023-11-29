package Practice2;

public class Punkt5 {
    public static void main(String[] args) {
        int number = 7;
        long factorial = calculateFactorial(number);

        if (factorial >= 0) {
            System.out.println("Факториал числа " + number + " равен " + factorial);
        } else {
            System.out.println("Ошибка: Факториал определен только для неотрицательных целых чисел");
        }
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
