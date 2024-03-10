package src.main.java.io.codelex.classesandobjects.practice.dates;

import java.util.ArrayList;
import java.util.Scanner;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(String day, String month, String year) {
        this.day = Integer.parseInt(day);
        this.month = Integer.parseInt(month);
        this.year = Integer.parseInt(year);
    }

    public void setDate() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Day: ");
        day = userInput.nextInt();
        System.out.print("Month: ");
        month = userInput.nextInt();
        System.out.print("Year: ");
        year = userInput.nextInt();
    }

    public void getDate() {
        System.out.printf("Currently set Day:%d Month:%d Year:%d\n", this.day, this.month, this.year);

    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String displayDate() {
        return this.day + "/" + this.month + "/" + this.year;
    }

}
