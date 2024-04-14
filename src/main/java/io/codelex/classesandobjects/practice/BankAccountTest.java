package src.main.java.io.codelex.classesandobjects.practice;

import io.codelex.classesandobjects.practice.BankAccount;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter account name: ");
        account.name = scanner.nextLine();

        System.out.print("Enter initial balance: $");
        account.balance = scanner.nextDouble();

        System.out.println("Account created: " + account);

        System.out.print("Enter deposit amount: $");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Current balance after deposit: " + account);

        System.out.print("Enter withdrawal amount: $");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Current balance after withdrawal: " + account);
    }
}