package secao9.applications;

import secao9.entities.Client;
import secao9.entities.Order;
import secao9.entities.OrderItem;
import secao9.entities.Product;
import secao9.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Test {

    public static void main(String args[]) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(input.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(input.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int N = input.nextInt();

        for ( int i = 1; i <= N; i++ ) {

            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            input.nextLine();
            String nameProduct = input.nextLine();
            System.out.print("Product price: ");
            double price = input.nextDouble();

            Product product = new Product(nameProduct, price);

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        input.close();
    }
}
