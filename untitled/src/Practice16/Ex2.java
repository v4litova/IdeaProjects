package Practice16;

import java.util.Scanner;

/*public class Practice19.Practice22.Ex1.Ex2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
        //Ввод: Qwerty, вывод: NumberFormatException
        //Ввод: 0, вывод: ArithmeticException
        //Ввод: 1.22, вывод: NumberFormatException
    }
}*/

public class Ex2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите целое число  ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);//преобразование в целое число
        } catch (NumberFormatException e) {
            System.out.println("Нецелочисленный ввод");
            return;
        }
        try {
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}
