package secao13.applications;

import secao13.entities.Deparment;
import secao13.entities.HourContract;
import secao13.entities.Worker;
import secao13.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;


public class Test {
    public static void main(String args[]) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departement's name: ");
        String nameDepart = input.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Level: ");
        String level = input.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = input.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Deparment());

        System.out.print("How many contracts to this worker? ");
        int n = input.nextInt();

        for ( int i = 1; i <= n; i++ ) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            input.nextLine();
            Date date = sdf.parse(input.next());
            System.out.print("Value per hours: ");
            double valueHours = input.nextDouble();
            System.out.print("Duration (Hours): ");
            int hours = input.nextInt();
            HourContract contract = new HourContract(date, valueHours, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = input.nextLine();

        int c_month = Integer.parseInt(monthAndYear.substring(0, 2));
        int c_year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDeparment().getName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(c_year, c_month));

        input.close();

    }
}
