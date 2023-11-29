package Practice11.Ex1;
//Написать тестовый класс, который создает массив класса Practice15.Practice16.Practice17.Practice19.Practice22.Ex1.Practice17.Practice19.Practice22.Ex1.Ex2.Student и
//сортирует массив iDNumber и сортирует его вставками.
public class InsertionSortTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(123, "Alice"),
                new Student(456, "Bob"),
                new Student(789, "Charlie"),
                new Student(234, "David"),
                new Student(567, "Eve")
        };

        System.out.println("Before sorting:");
        printStudents(students);

        // Вызываем метод сортировки вставками
        insertionSort(students);

        System.out.println("After sorting by IDNumber:");
        printStudents(students);
    }

    public static void insertionSort(Comparable[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            Comparable key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }
}
