package applications;

import entities.Rectangle;
import java.util.Scanner;

public class TesteRectangle {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");

        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.println(rectangle.toString());

    }
}
