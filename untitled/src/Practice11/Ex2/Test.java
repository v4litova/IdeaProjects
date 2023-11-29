package Practice11.Ex2;

import java.util.List;
import java.util.ArrayList;

//Напишите класс SortingStudentsByGPA который реализует интерфейс
//Comparator таким образом, чтобы сортировать список студентов по их
//итоговым баллам в порядке убывания с использованием алгоритма быстрой
//сортировки.
public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 4.0));
        students.add(new Student("David", 3.9));
        students.add(new Student("Eve", 3.7));

        // Создаем экземпляр SortingStudentsByGPA
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Сортируем список студентов с использованием быстрой сортировки
        sorter.quickSort(students, 0, students.size() - 1);

        // Теперь список students отсортирован по итоговым баллам в порядке убывания
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}

