package Practice15.Ex2;
//Напишите реализацию программного кода, с использованием
//паттерна MVC для расчета заработной платы сотрудника предприятия


public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new
                EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary(90000);
        System.out.println("\nAfter updating, Employee Details are as follows");
        controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setSalary(100000);
        return employee;
    }
}
