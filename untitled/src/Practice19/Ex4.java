package Practice19;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
//Написать функцию, которая сохранит содержимое каталога в
//список и выведет первые 5 элементов на экран
public class Ex4 {
    public static void main(String[] args) {
        // Замените "путь_к_каталогу" на актуальный путь к вашему каталогу
        String directoryPath = "D:\\Учеба\\Философия";

        try {
            List<Path> files = listFilesInDirectory(directoryPath);

            System.out.println("Первые 5 элементов в каталоге:");
            for (int i = 0; i < Math.min(5, files.size()); i++) {
                System.out.println(files.get(i));
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении каталога: " + e.getMessage());
        }
    }

    public static List<Path> listFilesInDirectory(String directoryPath) throws IOException {
        List<Path> fileList = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            for (Path path : stream) {
                fileList.add(path);
            }
        }
        return fileList;
    }
}
