package secao.secao5;

import java.util.Scanner;

/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

public class Exercicio01 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println(Exercicio01.isNegative(number));

    }

    private static String isNegative(int number) {
        String numberVerific = " ";
        if  ( number > 0 ) {
            numberVerific = "NÃO NEGATIVO";
        } else {
            numberVerific = "NEGATIVO";
        }
        return numberVerific;
    }
}
