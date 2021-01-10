package secao14.aula.applications;

import secao14.aula.entities.Employee;
import secao14.aula.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int N = sc.nextInt();

        for ( int i = 1; i <= N; i++ ) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)?: ");
            char outSourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value por hour: ");
            double perHours = sc.nextDouble();
            if ( outSourced == 'y' ) {
                System.out.print("Addicional charge: ");
                double addicional = sc.nextDouble();
                listEmployee.add(new OutsourcedEmployee(name, hours, perHours, addicional));
            }  else {
                listEmployee.add(new Employee(name, hours, perHours));
            }
        }


        System.out.println();
        System.out.println("Payments: ");

        for ( Employee emp : listEmployee ) {
            System.out.println(emp.getName() + "  - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
