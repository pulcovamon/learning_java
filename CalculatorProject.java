import java.util.Scanner;
import java.text.NumberFormat;

public class CalculatorProject {
    public static void main(String[] args) {
        /*
         * M = P * r*(1+r)^n / ((1+r)^n - 1) 
         * P -> principal
         * r -> monthly interest rate
         * n -> number of payments (number of months)
         */

        final byte monthsInYear = 12;
        final byte percent = 100;

        System.out.println("Welcome in morgage calculator.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter pricipal: ");
        int principal = scanner.nextInt();

        System.out.println("Please, enter annual interest rate in %: ");
        double annualInterestRate = scanner.nextDouble() / percent;               // % -> (0,1)
        double monthlyInterestRate = annualInterestRate / monthsInYear;

        System.out.println("Please enter period (years): ");
        int numberOfPayments = scanner.nextInt() * monthsInYear;                      // years -> months

        double bracket = Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double mortgage = principal * monthlyInterestRate * bracket / (bracket - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);

        System.out.println("Mortgage: " + result);
    }
}
