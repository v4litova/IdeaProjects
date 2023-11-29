package Practice10;
//Разложение на множители
//Дано натуральное число n>1. Выведите все простые множители этого
//числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
//сложность O(logn)
public class Ex7 {
    public static void main(String[] args) {
        int n = 80; // Замените на нужное число

        System.out.println("Простые множители числа " + n + ":");
        findPrimeFactors(n, 2);
    }

    static void findPrimeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }
        if (n % divisor == 0) {
            int count = 0;
            while (n % divisor == 0) {
                n /= divisor;
                count++;
            }
            for (int i = 0; i < count; i++) {
                System.out.print(divisor);
                System.out.print(" ");
            }
        }
        findPrimeFactors(n, divisor + 1);
    }
}
