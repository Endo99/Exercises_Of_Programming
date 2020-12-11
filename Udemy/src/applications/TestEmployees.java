package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.Employees;

public class TestEmployees {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        List<Employees> employees = new ArrayList<>();

        System.out.print("How many employees will be registered?");
        int N = input.nextInt();

        System.out.println();
        for ( int i = 1; i <= N; i++ ) {
            System.out.print("Employee#" + i);
            System.out.print("Id: ");
            input.nextLine();
            int id = input.nextInt();
            while (hasId(employees, id)) {
                System.out.print("ID already taken. Try again!");
                id = input.nextInt();
            }
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            System.out.println();
            employees.add(new Employees(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase:");
        int id = input.nextInt();
        Employees emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println("List of employees: ");
        for (Employees obj : employees) {
            System.out.println(obj);
        }
    }


    public static boolean hasId(List<Employees> list, int id) {
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
