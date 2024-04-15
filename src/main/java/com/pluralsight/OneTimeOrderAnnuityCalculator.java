package com.pluralsight;

import java.util.Scanner;

public class OneTimeOrderAnnuityCalculator {
    public static void calculate(Scanner scanner) {
        System.out.println("\n\nWelcome to the Present Value of an Order Annuity Calculator!\n\n");
        System.out.println("Expected Monthly Payout: ");
        double expectedMonthlyPayout = scanner.nextDouble();
        System.out.println("Expected Interest Rate: ");
        double expectedInterestRate = scanner.nextDouble();
        System.out.println("Payment Length in Years: ");
        int paymentLength = scanner.nextInt();

        double yir = (expectedInterestRate / 100) / 12;
        double presentValue = (expectedMonthlyPayout * ((1 - (Math.pow((1 + yir), (-12 * paymentLength)))) / yir));

        System.out.printf("\nTo fund an annuity that pays $%.2f monthly, for %d years and earns an expected interest rate of %%%.2f, you would need to invest $%.2f today.\n", expectedMonthlyPayout, paymentLength, expectedInterestRate, presentValue);
    }
}
