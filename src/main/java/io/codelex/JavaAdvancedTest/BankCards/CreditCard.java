package io.codelex.JavaAdvancedTest.BankCards;

public class CreditCard extends abstractBankCard {

    public CreditCard(String firstName, String lastName, int number, int CVV, double balance) {
        super(firstName, lastName, number, CVV, balance);

    }


    @Override
    public double takeMoney(double money) {
        if (balance - money <= 100) {
            System.out.println("Warning: Low funds");
        }
        return this.balance -= money;
    }

}
