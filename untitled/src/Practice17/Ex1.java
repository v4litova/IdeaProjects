package Practice17;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ФИО");
        String fio = in.next();

        System.out.println("Введите номер ИНН");
        String inn = in.next();

        if (inn.length() != 12) {
            throw new NullPointerException("ИНН неверный");
        }

        int[] n = new int[12];
        char[] inn_chars = inn.toCharArray();

        for (int i = 0; i < n.length; i++) {
            n[i] = (int)(inn_chars[i] - '0');//преобразуем символьный массив в целочисленный
        }
        int control1 = ((7 * n[0] + 2 * n[1] + 4 * n[2] + 10 * n[3] + 3 * n[4] + 5 * n[5] + 9 * n[6] + 4 * n[7] + 6 * n[8] + 8 * n[9]) % 11) % 10;
        int control2 = ((3 * n[0] + 7 * n[1] + 2 * n[2] + 4 * n[3] + 10 * n[4] + 3 * n[5] + 5 * n[6] + 9 * n[7] + 4 * n[8] + 6 * n[9] + 8 * n[10]) % 11) % 10;

        if ((n[10] == control1) && (n[11] == control2)) {
            System.out.println("ИНН верный");
        }
        else {
            throw new NullPointerException("ИНН неверный");
        }
    }
}
