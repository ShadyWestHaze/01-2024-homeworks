package src.main.java.io.codelex.classesandobjects.practice.SavingAccount;

import java.util.Scanner;

public class SavingsTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How much money is in the account?:");
        double startBalance = userInput.nextDouble();
        System.out.println("Enter the annual interest rate:");
        double interestRate = userInput.nextDouble();
        System.out.println("How long has the account been opened (in months)?:");
        int accountLifetime = userInput.nextInt();

        SavingsAccount savingsAccount = new SavingsAccount(startBalance, interestRate, accountLifetime);

        for (int i = 1; i <= accountLifetime; i++) {
            System.out.printf("Enter amount deposited for month %d:", i);
            savingsAccount.deposit(userInput.nextDouble());
            System.out.printf("Enter amount withdrawn for month %d:", i);
            savingsAccount.withdraw(userInput.nextDouble());
            savingsAccount.calculateInterest();
        }

        System.out.printf("Total deposited: $%.2f%n", savingsAccount.getTotalDeposited());
        System.out.printf("Total withdrawn: $%.2f%n", savingsAccount.getTotalWithdrawn());
        System.out.printf("Interest earned: $%.2f%n", savingsAccount.getTotalInterestEarned());
        System.out.printf("Ending balance: $%.2f%n", savingsAccount.getEndingBalance());
    }
}
