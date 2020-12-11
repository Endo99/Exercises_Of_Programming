package applications;
import entities.Employee;


import java.util.Scanner;
import java.util.Locale;

public class TesteEmployee {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();
        double percent;

        System.out.println("Enter with your name: ");
        employee.name = input.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.println("Tax: ");
        employee.tax = input.nextDouble();

        employee.netSalary();

        System.out.println("Employee: " + employee.toString());
        System.out.println();

        System.out.println("Which percentage to increase to Salary? ");
        percent = input.nextDouble();
        employee.increaseSalary(percent);

        System.out.println();

        System.out.println("Updated: " + employee.toString());


    }
}
