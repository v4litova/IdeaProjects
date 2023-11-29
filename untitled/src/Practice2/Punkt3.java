package Practice2;

public class Punkt3 {
    public static void main(String[] args) {
        int n = 10; // Количество чисел в ряду

        System.out.println("Первые 10 чисел гармонического ряда:");
        System.out.print("1");

        for (int i = 2; i <= n; i++) {
            System.out.print(" 1/" + i);
        }
    }
}
