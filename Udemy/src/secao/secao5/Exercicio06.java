package secao.secao5;

import java.util.Scanner;
import java.util.Locale;

/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */

public class Exercicio06 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        double valor = 0;

        System.out.println("Digite um valor: ");
        valor = input.nextDouble();

        if (valor >= 0 || valor <= 25) {
            System.out.println("O valor digitado, se encontra entre os intervalos de 0 e 25");
        } else if (valor >= 25 || valor <= 50) {
            System.out.println("O valor digitado, se encontra entre os intervalos de 25 e 50");
        } else if (valor >= 50 || valor <= 75) {
            System.out.println("O valor digitado, se encontra entre os intervalos de 50 e 75");
        } else if (valor >= 75 || valor <= 100) {
            System.out.println("O valor digitado, se encontra entre os intervalos de 75 e 100");
        } else {
            System.out.println("O valor digitado, se encontra fora dos intveralos");
        }

    }
}