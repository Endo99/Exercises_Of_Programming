package secao.secao4;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]) {
        int A, B, C, D;
        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        System.out.println(diferencaEntreProdutos(A, B, C, D));
    }

    private static int diferencaEntreProdutos(int A, int B, int C, int D) {
        int diferenca = 0;
        diferenca = (A * B) - (C * D);
        return diferenca;
    }
}
