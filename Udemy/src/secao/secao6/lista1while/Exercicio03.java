package secao.secao6.lista1while;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        opcao = input.nextInt();
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while ( opcao != 4) {

            if ( opcao == 1) {
                gasolina += 1;
            } else if ( opcao == 2 ) {
                alcool += 1;
            } else if ( opcao == 3 ) {
                diesel += 1;
            }

            opcao = input.nextInt();

        }

        System.out.println("Muito Obrigado!");
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Álcool: " + alcool);
        System.out.println("Diesel: " + diesel);

    }

}
