package src.main.java.io.codelex.classesandobjects.practice.SavingAccount;


public class SavingsAccount {
    private double startBalance;
    private final double interestRateAnnually;
    private final int accountLifetime;
    private double totalDeposited;
    private double totalWithdrawn;
    private double totalInterestEarned;

    public SavingsAccount(double startBalance, double interestRateAnnually, int accountLifetime) {
        this.startBalance = startBalance;
        this.interestRateAnnually = interestRateAnnually;
        this.accountLifetime = accountLifetime;
    }

    public void withdraw(double amount) {
        startBalance -= amount;
        totalWithdrawn += amount;
    }

    public void deposit(double amount) {
        startBalance += amount;
        totalDeposited += amount;
    }

    public void calculateInterest() {
        double monthlyInterestRate = interestRateAnnually / 12;
        double monthlyInterest = startBalance * monthlyInterestRate;
        startBalance += monthlyInterest;
        totalInterestEarned += monthlyInterest;
    }


    public double getTotalDeposited() {
        return totalDeposited;
    }

    public double getTotalWithdrawn() {
        return totalWithdrawn;
    }

    public double getTotalInterestEarned() {
        return totalInterestEarned;
    }

    public double getEndingBalance() {
        return startBalance;
    }
}
