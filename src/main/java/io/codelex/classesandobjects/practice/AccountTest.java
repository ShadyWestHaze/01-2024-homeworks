package src.main.java.io.codelex.classesandobjects.practice;

import io.codelex.classesandobjects.practice.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("firstExercise", 100);
        account1.deposit(20);
        System.out.println(account1);

        Account matsAccount = new Account("Matt's account", 100);
        Account account = new Account("Account", 0);
        matsAccount.withdrawal(100);
        account.deposit(100);
        System.out.println(matsAccount + "\n" + account);

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        Account.transfer(a, b, 50);
        Account.transfer(b, c, 25);
        System.out.println(a + "\n" + b + "\n" + c);

    }
}
