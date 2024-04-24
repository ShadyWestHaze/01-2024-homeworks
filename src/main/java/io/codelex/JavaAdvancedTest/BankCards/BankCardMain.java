package io.codelex.JavaAdvancedTest.BankCards;

public class BankCardMain {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Name", "LastName", 123456789, 123, 120);
        creditCard.takeMoney(100);

        System.out.println(creditCard.getNumber());
        System.out.println(creditCard.getBalance());
        System.out.println(creditCard.getCVV());
        System.out.println(creditCard.getFirstName());
        System.out.println(creditCard.getLastName());
        System.out.println(creditCard.fullName());

        DebitCard debitCard = new DebitCard("Name", "LastName", 123456789, 123, 9000);
        debitCard.addMoney(1500);

    }
}
