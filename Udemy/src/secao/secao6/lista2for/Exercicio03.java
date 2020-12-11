package secao.secao6.lista2for;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int N = 0;
        double mediaP = 0;

        N = input.nextInt();
        for (int i = 0; i < N; i++) {

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            mediaP = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.01f%n",mediaP);
        }

        input.close();
    }
}
