package secao.secao5;

import java.util.Scanner;

/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */

public class Exercicio02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number = 0;

        number = input.nextInt();

        System.out.println(Exercicio02.isPar(number));
    }

    private static String isPar(int number) {

        String verifiedNumber = " ";

        if (number % 2 == 0) {
            verifiedNumber = "PAR";
        } else {
            verifiedNumber = "ÍMPAR";
        }

        return verifiedNumber;
    }
}
