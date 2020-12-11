package applications;

import java.util.Scanner;
import util.CurrentyConverter;

public class TestCurrentyConverter {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        CurrentyConverter.dollar = input.nextDouble();
        System.out.println("How many dollars will be bought?");
        CurrentyConverter.dollarConverter = input.nextDouble();

        double moneyConvertation = CurrentyConverter.converterDollarInReal( CurrentyConverter.dollar,
                CurrentyConverter.dollarConverter );

        System.out.println("Amount to paid in reais = " +
                String.format("%.2f", moneyConvertation));
    }
}
