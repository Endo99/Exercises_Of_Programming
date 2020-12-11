package secao.secao4;
import java.util.Locale;
import java.util.Scanner;

/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . rai^2
Considere o valor de π = 3.14159 */
public class Exercicio02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Locale.setDefault(Locale.US); // faz com que tem o sistema americano de pontuação, troca o "," por ".";

        double raio = 0;

        System.out.println("Digite o raio a ser calculado: ");
        raio = input.nextDouble();

        System.out.println("A área do círculo é de: " + Exercicio02.calculoArea(raio));
    }

    private static double calculoArea(double raio) {
        double area, pi = 3.14159;

        area = pi * (raio * raio);

        return area;
    }
}
