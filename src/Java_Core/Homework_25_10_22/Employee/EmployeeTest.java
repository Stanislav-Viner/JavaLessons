package Java_Core.Homework_25_10_22.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 2.0, 40);
        Employee employee2 = new Employee("Jack", 1.5, 30);
        Employee employee3 = new Employee("Jim", 1.25, 20);

        Employee.totalSum = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();
        System.out.printf("The total salary of all workers: %.2f", Employee.totalSum);
    }

}
