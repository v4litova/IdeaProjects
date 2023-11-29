package Practice16;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите целое число ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Нецелочисленный ввод");
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}
