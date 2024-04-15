package src.main.java.io.codelex.collections.practice.phonebook;

import java.util.Scanner;

public class PhoneDirectoryTest {
    public static void main(String[] args) {
        io.codelex.collections.practice.phonebook.PhoneDirectory directory = new io.codelex.collections.practice.phonebook.PhoneDirectory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Phone Directory!");
        while (true) {
            System.out.println("\n1. Add a contact");
            System.out.println("2. Show all contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number: ");
                    String number = scanner.nextLine();
                    directory.putNumber(name, number);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.println("\nAll Contacts:");
                    for (String contactName : directory.getAllContacts()) {
                        System.out.println(contactName + ": " + directory.getNumber(contactName));
                    }
                    break;

                case 3:
                    System.out.println("byeee");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        }
    }


}
