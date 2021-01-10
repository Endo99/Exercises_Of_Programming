package secao10.applications;

import secao10.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestEmployee {

    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many employess will be registered? ");
        int n = input.nextInt();

        List<Employee> list = new ArrayList<>();

        for ( int i = 0; i <= n; i++ ) {
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            input.nextLine();
            int id = input.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = input.nextInt();
            }
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = input.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if ( emp == null ) {
            System.out.print("This id does not exist!");
        } else {
            System.out.print("Enter the porcentage: ");
            double porcent = input.nextDouble();
            emp.increase(porcent);
        }



    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
