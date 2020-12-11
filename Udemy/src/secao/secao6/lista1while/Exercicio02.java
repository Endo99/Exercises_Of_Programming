package secao.secao6.lista1while;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;

        x = input.nextInt();
        y = input.nextInt();

        while ( x != 0 || y != 0 ) {

            if ( x > 0 && y > 0 ) {
                System.out.println("1° Quadrante");
            } else if ( x < 0 && y > 0 ) {
                System.out.println("2° Quadrante");
            } else if ( x < 0 && y < 0 ) {
                System.out.println("3° Quadrante");
            } else {
                System.out.println("4° Quadrante");
            }

            x = input.nextInt();
            y = input.nextInt();
        }
    }

}
