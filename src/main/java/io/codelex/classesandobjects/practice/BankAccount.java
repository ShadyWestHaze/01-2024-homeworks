package io.codelex.classesandobjects.practice;

import java.util.Scanner;

// Each BankAccount object represents one user's account
// information including name and balance of money.
public class BankAccount {
    public String name;
    public double balance;

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

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid amount for withdrawal");
        }
    }

    public String toString() {
        String formattedBalance = String.format("%.2f", Math.abs(balance));
        if (balance >= 0) {
            return name + ", $" + formattedBalance;
        } else {
            return name + ", -$" + formattedBalance;
        }
    }
}

