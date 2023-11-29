package Practice15.Ex1;
//паттерн MVC - модель, вид, контроллер
//Напишите реализацию программного кода по UML диаграмме, представленной на рисунке
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new
                StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNo("45673");
        System.out.println("\nAfter updating, Student Details are as follows");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Janna");
        student.setRollNo("1234");
        return student;
    }
}
