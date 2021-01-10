package secao10.applications;

import java.util.Scanner;

public class Matriz {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int matriz[][] = new int[N][M];

        for ( int  i = 0; i < matriz.length; i++ ) {
            for ( int j = 0; i < matriz[i].length; i++ ) {
                int X = input.nextInt();
                if ( X == matriz[i][j] ) {
                    System.out.println("Position: " + i + "," + j + ":");
                    if ( j > 0 ) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if ( i > 0 ) {
                        System.out.println("Up: " + matriz[i+1][j]);
                    }
                    if ( j < matriz[i].length - 1 ) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if ( i < matriz.length - 1 ) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }
        input.close();
    }
}
