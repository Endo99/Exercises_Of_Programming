package secao.secao6.lista2for;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int N = 0;
        int X = 0;
        int quantidadeIn = 0;
        int quantidadeOut = 0;
        N = input.nextInt();

        for ( int i = 0; i < N; i++ ) {
            X = input.nextInt();
            if ( X >= 10 && X <= 20 ) {
                quantidadeIn++;
            } else {
                quantidadeOut++;
            }
        }
        System.out.println(quantidadeIn + " " + "in");
        System.out.println(quantidadeOut + " " + "out");
    }
}
