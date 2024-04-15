package com.pluralsight;

import java.util.Scanner;

public class FutureOneTimeDepositCalculator {
    public static void calculate(Scanner scanner) {
        System.out.println("\n\nWelcome to the Future Value of a One Time Deposit Calculator!\n\n");
        System.out.println("Initial Deposit Amount: ");
        double initialDeposit = scanner.nextDouble();
        System.out.println("Current Interest Rate: ");
        double dailyInterestRate = scanner.nextDouble();
        System.out.println("Deposit Length in Years: ");
        int depositLength = scanner.nextInt();

        double ir = (dailyInterestRate / 100) / 365;
        double totalValue = (initialDeposit * (Math.pow((1 + ir), 365*depositLength)));
        double totalInterestEarned = totalValue - initialDeposit;

        System.out.printf("\nYour deposit will be worth $%.2f after %d years with a total interest of $%.2f", totalValue, depositLength, totalInterestEarned);
    }
}
