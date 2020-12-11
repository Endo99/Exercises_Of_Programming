package applications;

import java.util.Scanner;
import entities.Rooms;

public class TestRooms {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many rooms will be rented?");
        int N = input.nextInt();
        Rooms[] rooms = new Rooms[10];

        for ( int i = 1; i <= N; i++ ) {
            System.out.println("Rent#" + i + ":");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();
            rooms[i] = new Rooms( name, email );
            System.out.println();
        }

        System.out.println();
        System.out.println("Busy Rooms:");
        for ( int i = 0; i < 10; i++ ) {
            if ( rooms[i] != null ) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        input.close();
    }
}
