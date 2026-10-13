import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class EmployeeSalaryMain {
    public static Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id: ");
        int id = scanner.nextInt();

        System.out.println("Enter Name: ");
        String name = scanner.next();

        System.out.println("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);

        return employee;
    }

    public static int getPFPercentage() {
        Scanner sacanner = new Scanner(System.in);
        System.out.println("Enter PF percentage: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Employee employee = getEmployeeDetails();
        int pf = getPFPercentage();

        employee.calculateNetSalary(pf);

        System.out.println("Id: " + employee.getEmployeeId());
        System.out.prinltln("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println(:"Net Salary: " + employee.getNetSalary());
    }
}