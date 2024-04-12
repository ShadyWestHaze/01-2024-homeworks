package io.codelex.oop.summary.generics;

public class PrinterMain {
    public static void main(String[] args) {
        Printer<String> printerString = new Printer<>("thing to print");
        printerString.print();
        Printer<Integer> printerInt = new Printer<>(314);
        printerInt.print();
    }
}
