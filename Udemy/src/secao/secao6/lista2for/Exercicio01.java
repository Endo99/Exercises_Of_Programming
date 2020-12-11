package secao.secao6.lista2for;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int number = 0;

        number = input.nextInt();

        for ( int i = 1; i < number; i++ ) {
            if ( i % 2 == 1 ) {
                System.out.println(i);
            }
        }

    }
}
