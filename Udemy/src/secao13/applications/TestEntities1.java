package secao13.applications;

import secao13.entities1.Client;
import secao13.entities1.Order;
import secao13.entities1.OrderItem;
import secao13.entities1.Product;
import secao13.entities1.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class TestEntities1 {

    public static void main(String args[]) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(input.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(input.next());

        Order order = new Order(new Date(), status);

        System.out.print("How many itens to this order? ");
        int n = input.nextInt();
        for ( int i = 1; i <= n; i++ ) {
            System.out.println("Enter #" + i + "item data:");
            System.out.print("Product name: ");
            input.nextLine();
            String productName = input.nextLine();
            System.out.print("Product price: ");
            double price = input.nextDouble();

            Product product = new Product(productName, price);

            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            OrderItem item = new OrderItem(quantity, price, product);
            order.addItem(item);
        }

        System.out.println("ORDER SUMMARY:");

        System.out.print(order);

        input.close();
    }
}
