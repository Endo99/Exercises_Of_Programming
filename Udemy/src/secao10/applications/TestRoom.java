package secao10.applications;

import secao10.entities.Room;

import java.util.Scanner;

public class TestRoom {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Room[] rooms = new Room[10];

        System.out.println("How many rooms will be rented? ");
        int n = input.nextInt();

        for ( int i = 1; i <= n; i++ ) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();
            rooms[room] = new Room(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for ( int i = 0; i < 10; i++ ) {
            if ( rooms[i] != null ) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
        input.close();
    }

}
