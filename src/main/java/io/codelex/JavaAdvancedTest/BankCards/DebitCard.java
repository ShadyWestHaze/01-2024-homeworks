package io.codelex.JavaAdvancedTest.BankCards;

public class DebitCard extends abstractBankCard {

    public DebitCard(String firstName, String lastName, int number, int CVV, double balance) {
        super(firstName, lastName, number, CVV, balance);

    }

    @Override
    public double addMoney(double money) {
        if (balance + money >= 10000) {
            System.out.println("Warning: Too much money");
        }
        return this.balance += money;
    }

}
