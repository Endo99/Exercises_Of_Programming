package secao.secao4;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor
a ser pago.*/

public class Exercicio05 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo1, qtd1, codigo2, qtd2;
        double  preco1, preco2;

        System.out.println("Codigo da primeira peça: ");
        codigo1 = input.nextInt();
        System.out.println("Quantidade: ");
        qtd1 = input.nextInt();
        System.out.println("Valor: ");
        preco1 = input.nextDouble();
        System.out.println("Codigo da segunda peça: ");
        codigo2 = input.nextInt();
        System.out.println("Quantidade: ");
        qtd2 = input.nextInt();
        System.out.println("Valor: ");
        preco2 = input.nextDouble();

        double pagar = (qtd1 * preco1) + (qtd2 * preco2);

        System.out.println("Valor a pagar: " + pagar);
    }
}
