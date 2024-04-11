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
                    System.out.println("\n\nWelcome to the Mortgage calculator!\n\n");
                    System.out.println("Please enter your loan amount: ");
                    float loanAmount = scanner.nextFloat();
                    System.out.println("Please enter your current interest rate per year: ");
                    float interestRate = scanner.nextFloat();
                    System.out.println("Please enter your payment length in years: ");
                    int loanLength = scanner.nextInt();

                    int n = loanLength * 12;
                    float i = (interestRate / 100) / 12;
                    double monthlyPayment = (loanAmount * (i * Math.pow((1 + i), n))) / (Math.pow((1 + i), n) - 1);
                    double totalInterest = (monthlyPayment * n) - loanAmount;

                    System.out.printf("\nYour monthly loan payment is $%.2f with a total interest of $%.2f", monthlyPayment, totalInterest);
                    break;

                case 2: //future value of one time deposit
                    System.out.println("\n\nWelcome to the Future Value of a One Time Deposit Calculator!\n\n");
                    System.out.println("Initial Deposit Amount: ");
                    float initialDeposit = scanner.nextFloat();
                    System.out.println("Current Interest Rate: ");
                    float dailyInterestRate = scanner.nextFloat();
                    System.out.println("Deposit Length in Years: ");
                    int depositLength = scanner.nextInt();

                    float ir = (dailyInterestRate / 100) / 365;
                    double totalValue = (initialDeposit * (Math.pow((1 + ir), 365*depositLength)));
                    double totalInterestEarned = totalValue - initialDeposit;

                    System.out.printf("\nYour deposit will be worth $%.2f after %d years with a total interest of $%.2f", totalValue, depositLength, totalInterestEarned);
                    break;

                case 3: //present value of order annuity
                    System.out.println("\n\nWelcome to the Present Value of an Order Annuity Calculator!\n\n");
                    System.out.println("Expected Monthly Payout: ");
                    float expectedMonthlyPayout = scanner.nextFloat();
                    System.out.println("Expected Interest Rate: ");
                    float expectedInterestRate = scanner.nextFloat();
                    System.out.println("Payment Length in Years: ");
                    int paymentLength = scanner.nextInt();

                    float yir = (expectedInterestRate / 100) / 12;
                    double presentValue = (expectedMonthlyPayout * ((1 - (Math.pow((1 + yir), (-12*paymentLength)))) / yir));

                    System.out.printf("\nTo fund an annuity that pays $%.2f monthly, for %d years and earns an expected interest rate of %%%.2f, you would need to invest $%.2f today.\n", expectedMonthlyPayout, paymentLength, expectedInterestRate, presentValue);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Please select the number corresponding to the calculator you would like to use.");
        }
    }
}