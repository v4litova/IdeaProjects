package Practice13;

import java.io.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("notes3.txt", true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст для записи в файл: ");
            String text = scanner.nextLine();
            writer.write('\n' + text);

            // запись по символам
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}