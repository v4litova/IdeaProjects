package Practice13;//Реализовать запись в файл введённой с клавиатуры информации
import java.io.*;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("notes3.txt", false)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст для записи в файл: ");
            String text = scanner.nextLine();
            writer.write(text);

            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
