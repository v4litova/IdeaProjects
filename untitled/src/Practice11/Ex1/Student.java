package Practice11.Ex1;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Сравниваем студентов на основе iDNumber
        return Integer.compare(this.iDNumber, otherStudent.iDNumber);
    }
}
