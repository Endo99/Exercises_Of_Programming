package secao.secao6.lista2for;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int N = 0;

        N = input.nextInt();

        int quadrado;
        int cubo;

        for ( int i = 1; i <= N; i++ ) {
            quadrado = i * i;
            cubo = i * i * i;
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }

    }
}
