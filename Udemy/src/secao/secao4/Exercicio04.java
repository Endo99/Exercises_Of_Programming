package secao.secao4;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        int number = 0;
        double salario = 0;
        int hora = 0;

        number = input.nextInt();
        hora = input.nextInt();
        salario = input.nextDouble();


        System.out.println("NUMBER: " + number + "\n"
        + "SALARY: " + Exercicio04.calculoFuncionario(salario, hora));

    }

    private static double calculoFuncionario(double salarioHora, int hora) {
        double salarioAReceber = 0;

        salarioAReceber = hora * salarioHora;

        return salarioAReceber;
    }
}
