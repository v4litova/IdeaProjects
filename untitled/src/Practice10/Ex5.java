package Practice10;

//Сумма цифр числа
//91
//Дано натуральное число N. Вычислите сумму его цифр. При решении
//этой задачи нельзя использовать строки, списки, массивы (ну и циклы,
//разумеется).
public class Ex5 {
    public static void main(String[] args) {
        int N = 5050404;
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}
