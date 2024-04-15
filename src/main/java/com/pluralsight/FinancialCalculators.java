package com.pluralsight;
import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n\nChoose your calculator");
            System.out.println("1. Mortgage");
            System.out.println("2. Future Value of One-Time Deposit");
            System.out.println("3. Present Value of Order Annuity");
            int calculator = scanner.nextInt();
            if (calculator < 1 || calculator > 3) {
                System.out.println("Please enter a valid choice.");
            }

            switch (calculator) {
                case 1: //mortgage calculator
                    MortgageCalculator.calculate(scanner);
                    break;

                case 2: //future value of one time deposit
                    FutureOneTimeDepositCalculator.calculate(scanner);
                    break;

                case 3: //present value of order annuity
                    OneTimeOrderAnnuityCalculator.calculate(scanner);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Please select the number corresponding to the calculator you would like to use.");
        }
    }
}