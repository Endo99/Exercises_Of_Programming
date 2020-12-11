package secao.secao5;

import java.util.Scanner;

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
em ordem crescente ou decrescente. */

public class Exercicio03 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int multiplo = 0;
        int verifiedMultiplo = 0;

        multiplo = input.nextInt();
        verifiedMultiplo = input.nextInt();

        System.out.println(isMultiple(multiplo, verifiedMultiplo));
    }

    private static String isMultiple(int numberMultiple, int numberVerified) {

        String verified;

        if ( numberVerified % numberMultiple == 0 || numberMultiple % numberVerified == 0 )
            verified = "SÃO MÚLTIPLOS";
        else verified = "NÃO SÃO MÚLTIPLOS";

        return verified;
    }

}
