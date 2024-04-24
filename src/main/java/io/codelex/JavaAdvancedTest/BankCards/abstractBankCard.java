package io.codelex.JavaAdvancedTest.BankCards;

public abstract class abstractBankCard implements BankCard {

    private final String firstName;
    private final String lastName;
    public double balance;
    private final int number;
    private final int CVV;

    public AbstractBankCard(String firstName, String lastName, int number, int CVV, double balance) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.number = number;
        this.CVV = CVV;
    }


    @Override
    public String fullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return this.number;
    }

    public int getCVV() {
        return CVV;
    }

    @Override
    public double addMoney(double money) {
        return this.balance += money;
    }

    @Override
    public double takeMoney(double money) {
        return this.balance -= money;
    }


}
