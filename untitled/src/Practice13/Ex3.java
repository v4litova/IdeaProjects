package Practice13;
//Заменить информацию в файле на информацию, введённую с клавиатуры

import java.io.*;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Путь к файлу
        String filePath = "C:\\Users\\Диана\\IdeaProjects\\notes3.txt";

        // Вывод исходного файла
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            System.out.println("Исходный файл содержит следующее:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла: " + ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(filePath, false)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст для записи в файл: ");
            String text = scanner.nextLine();
            writer.write( text);

            // запись по символам
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Вывод конечного файла
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            System.out.println("Конечный файл содержит следующее:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении конечного файла: " + ex.getMessage());
        }
    }
}