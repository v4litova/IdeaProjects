package Practice13;//Реализовать вывод информации из файла на экран
import java.io.*;
public class Ex2 {
    public static void main(String[] args) {
        try(FileReader reader = new
                FileReader("C:\\Users\\Диана\\IdeaProjects\\notes3.txt"))
        {
            // чтение по символам
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

