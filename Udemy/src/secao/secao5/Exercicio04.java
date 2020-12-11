package secao.secao5;

import java.util.Scanner;

/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
// Não fui eu que fiz!

public class Exercicio04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int timeInicial = input.nextInt();
        int timeFinal = input.nextInt();

        int duration = 0;
        if ( timeInicial < timeFinal ) {
            duration = timeFinal - timeInicial;
        } else {
            duration = (24 - timeInicial) + timeFinal;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");

    }

}
