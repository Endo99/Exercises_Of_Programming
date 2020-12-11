package util;

public class CurrentyConverter {

    public static double dollar;
    public static double dollarConverter;

    public static double converterDollarInReal ( double dollarPrice, double howManyDollar ) {

        double moneyConverter = dollarPrice * howManyDollar;
        double moneySomeConverter = moneyConverter * 6 / 100;

        return moneyConverter + moneySomeConverter;
    }

}
