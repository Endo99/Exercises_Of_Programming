package secao.secao4;
import javax.swing.*;
import java.util.Scanner;

/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

public class Exercicio01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;

        System.out.println("Insira uma número: ");
        number1 = input.nextInt();
        System.out.println("Insira uma número: ");
        number2 = input.nextInt();

        int somar = number1 + number2;

        System.out.println("O total da soma dos números é: " + somar);
    }
}
