package io.codelex.classesandobjects.practice;


// Each BankAccount object represents one user's account
// information including name and balance of money.
public class BankAccount {
    public String name;
    public double balance;

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


