package secao.secao6.lista2for;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int N = 0;
        N = input.nextInt();

        for ( int i = 0; i < N; i++ ) {

            int nume = input.nextInt();
            int deno = input.nextInt();

            double result = 0;

            if (deno == 0) {
                System.out.println("Divisão impossível");
            } else {
                result = ( double ) nume / deno;
                System.out.printf("%.01f%n", result);
            }
        }
    }
}
