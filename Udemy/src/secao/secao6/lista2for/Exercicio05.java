package secao.secao6.lista2for;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int n = 0;
        n = input.nextInt();

        int fatorial = 1;

        for ( int i = 1; i <= n; i++ ) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

    }

}
