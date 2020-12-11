package applications;

import java.util.Scanner;
import entities.Account;

public class TestAccount {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Account acc;

        System.out.print("Enter account number: ");
        int account = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Is there an inicial deposit (y/n)?");
        char answer = input.next().charAt(0);
        if ( answer == 'y' ) {
            System.out.print("Enter initial deposit value: ");
            double inicialDeposit = input.nextDouble();
            acc = new Account(account, holder, inicialDeposit);
        } else {
            acc = new Account(account, holder);
        }
        System.out.println();
        System.out.println(acc.toString());
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double amount = input.nextDouble();
        acc.deposit(amount);
        System.out.println("Account update: ");
        System.out.println(acc.toString());
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        amount = input.nextDouble();
        acc.withdraw(amount);
        System.out.println("Account update:");
        System.out.println(acc.toString());

        input.close();
    }


}
