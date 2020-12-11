package secao.secao4;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A, B, C;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        Exercicio06.calculoArea(A, B, C);

    }

    private static void calculoArea(double A, double B, double C) {
        final double pi = 3.14159;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        triangulo = (A * C) / 2;
        System.out.printf("TRIÂNGULO: %.03f%n", triangulo);
        circulo = pi * (C * C);
        System.out.printf("CIRCULO: %.03f%n", circulo);
        trapezio = (C * (A + B)) / 2;
        System.out.printf("TRAPÉZIO: %.03f%n", trapezio);
        quadrado = B * B;
        System.out.printf("QUADRADO: %.03f%n", quadrado);
        retangulo = A * B;
        System.out.printf("RETÂNGULO: %.03f%n", retangulo);

    }
}
