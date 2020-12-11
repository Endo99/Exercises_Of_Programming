package entities;

public class Student {

    public String name;
    public double notas;

    public double returnNotas( double notas1, double notas2, double notas3 ) {

        notas = notas1 + notas2 + notas3;
        return notas;

    }

    public String verificarPassed( double resultNotas ) {

        if ( resultNotas <= 60) {
            return "Failed \n" + "Missing " + (notas - 60) + "points";
        } else {
            return "Pass";
        }

    }

}
