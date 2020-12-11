package applications;
import entities.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String args[]) {

        Student student = new Student();

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.println("Enter your name: ");
        student.name = input.nextLine();

        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();

        System.out.println( student.returnNotas( nota1, nota2, nota3 ) );
        System.out.println(student.verificarPassed( student.notas ) );


    }
}
