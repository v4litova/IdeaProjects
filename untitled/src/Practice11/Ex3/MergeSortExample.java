package Practice11.Ex3;
import Practice11.Ex2.Student;
import java.util.ArrayList;
import java.util.List;

//Напишите программу, которая объединяет два списка данных о
//студентах в один отсортированный списках с использованием алгоритма
//сортировки слиянием.

public class MergeSortExample {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3.8));
        list1.add(new Student("Bob", 3.5));
        list1.add(new Student("David", 3.9));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", 4.0));
        list2.add(new Student("Eve", 3.7));

        List<Student> mergedAndSorted = mergeSort(list1, list2);

        System.out.println("Merged and sorted list:");
        for (Student student : mergedAndSorted) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() > list2.get(j).getGPA()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        // Применяем сортировку слиянием
        mergeSortRecursive(mergedList, 0, mergedList.size() - 1);

        return mergedList;
    }

    public static void mergeSortRecursive(List<Student> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortRecursive(list, left, mid);
            mergeSortRecursive(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    public static void merge(List<Student> list, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Student> leftList = new ArrayList<>(list.subList(left, left + n1));
        List<Student> rightList = new ArrayList<>(list.subList(mid + 1, mid + 1 + n2));

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftList.get(i).getGPA() >= rightList.get(j).getGPA()) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }
}

