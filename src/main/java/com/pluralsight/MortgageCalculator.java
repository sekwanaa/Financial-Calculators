package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void calculate(Scanner scanner) {
        System.out.println("\n\nWelcome to the Mortgage calculator!\n\n");
        System.out.println("Please enter your loan amount: ");
        double loanAmount = scanner.nextFloat();
        System.out.println("Please enter your current interest rate per year: ");
        double interestRate = scanner.nextFloat();
        System.out.println("Please enter your payment length in years: ");
        int loanLength = scanner.nextInt();

        int n = loanLength * 12;
        double i = (interestRate / 100) / 12;
        double monthlyPayment = (loanAmount * (i * Math.pow((1 + i), n))) / (Math.pow((1 + i), n) - 1);
        double totalInterest = (monthlyPayment * n) - loanAmount;

        System.out.printf("\nYour monthly loan payment is $%.2f with a total interest of $%.2f", monthlyPayment, totalInterest);
    }
}
