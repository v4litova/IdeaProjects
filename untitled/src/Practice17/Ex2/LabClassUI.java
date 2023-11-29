package Practice17.Ex2;
import java.util.Scanner;

public class LabClassUI {
    private Student[] students;
    private int count;
    public LabClassUI() {
        count = 0;
    }
    Scanner in = new Scanner(System.in);
    public void InputStudents() {
        System.out.println("Введите кол-во студентов: ");
        count = in.nextInt();
        students = new Student[count];
        System.out.println("Введите фио и баллы " + count + " студентов");
        for (int i = 0; i < count; i++) {
            students[i] = new Student(i, in.next(), in.nextInt());
        }
    }
    public void OutputSortedStudents() {
        System.out.println("Список студентов и их баллы: ");
        LabClass.Sort(students);
        for (int i = 0; i < count; i++) {
            System.out.print(students[i]);
        }
    }
    public void PrintStudentInfo() {
        System.out.println("Введите фамилию, имя, отчество студента");
        String fio = in.next();
        if (fio.compareTo("") == 0) {
            throw new EmptyStringException("Ввод пустой строки!");
        }
        System.out.println("Результат: " + LabClass.Search(students, new Student(0,fio,0)));
    }
}
