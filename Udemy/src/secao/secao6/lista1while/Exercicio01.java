package secao.secao6.lista1while;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int senha = 0;

        senha = input.nextInt();

        while ( senha != 2002 ) {
            System.out.println("Senha inválida! Por favor, digite novamente a senha!");
            senha = input.nextInt();
        }
        System.out.println("Acesso permitido!");

    }
}
