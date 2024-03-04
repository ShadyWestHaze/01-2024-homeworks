package src.main.java.io.codelex.arithmetic.practice;
//try catch error usage https://www.w3schools.com/java/java_try_catch.asp
public class FooCorporation {
    public static void main(String [] args){
        try {
            double employee1 = totalPay(7.50, 35);
            System.out.println(employee1+"$");
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating pay for employee 1: " + e.getMessage());
        }

        try {
            double employee2 = totalPay(8.20, 47);
            System.out.println(employee2+"$");
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating pay for employee 2: " + e.getMessage());
        }

        try {
            double employee3 = totalPay(10.00, 73);
            System.out.println(employee3+"$");
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating pay for employee 3: " + e.getMessage());
        }
    }

    public static double totalPay(double baseRate, int time){
        double overtimeRate = baseRate * 1.5;
        int overtime = 0;
        int maxTimeBaseRate = 40;

        if(time > 60){
            throw new IllegalArgumentException("You have worked more than the allowed time.");
        }

        if (time <= maxTimeBaseRate) {
            return time * baseRate;
        } else {
            int overtimeHours = time - maxTimeBaseRate;
            return (maxTimeBaseRate * baseRate) + (overtimeHours * overtimeRate);
        }
    }
}