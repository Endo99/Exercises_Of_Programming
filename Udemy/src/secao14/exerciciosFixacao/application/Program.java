package secao14.exerciciosFixacao.application;

import secao14.exerciciosFixacao.entities.ImportedProduct;
import secao14.exerciciosFixacao.entities.Product;
import secao14.exerciciosFixacao.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String args[]) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> listProduct = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = input.nextInt();

        for ( int i = 1; i <= n; i++ ) {
            System.out.println("Product #" + i + "data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            if ( productType == 'c' ) {
                listProduct.add(new Product(name, price));
            } else if ( productType == 'u' ) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(input.next());
                listProduct.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = input.nextDouble();
                listProduct.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for ( Product product : listProduct ) {
            System.out.println(product.priceTag());
        }
        input.close(); // testar ainda!
    }
}
