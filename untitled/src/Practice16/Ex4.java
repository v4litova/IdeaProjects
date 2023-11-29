package Practice16;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите целое число ");
        String intString = myScanner.next();
        int i = 2;
        try {
            i = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            System.out.println("Нецелочисленный ввод");
        } finally {
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }
        }
    }
}
