package secao.secao5;

import java.util.Scanner;

/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

                CÓDIGO      ESPECIFICAÇÃO       PREÇO
                   1        Cachorro-Quente     R$ 4,00
                   2        X-Salada            R$ 4,50
                   3        X-Bacon             R$ 5,00
                   4        Torrada simples     R$ 2,00
                   5        Refrigerante        R$ 1,50*/

public class Exercicio05 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int codigo = 0;
        int quantidade = 0;
        double valorResultante;

        System.out.println("Digite o código: ");
        codigo = input.nextInt();
        System.out.println("Digite a quantidade desejada: ");
        quantidade = input.nextInt();

        if ( codigo == 1 ) {
            valorResultante = quantidade * 4.00;
        } else if ( codigo == 2 ) {
            valorResultante = quantidade * 4.50;
        } else if ( codigo == 3 ) {
            valorResultante = quantidade * 5.00;
        } else if ( codigo == 4 ) {
            valorResultante = quantidade * 2.00;
        } else {
            valorResultante = quantidade * 1.50;
        }

        System.out.printf("O valor é de R$ %.02f reais", valorResultante);
    }
}
