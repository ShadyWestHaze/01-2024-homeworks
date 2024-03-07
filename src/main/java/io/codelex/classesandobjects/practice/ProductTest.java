package src.main.java.io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Logitech mouse", 70.00, 14),
                new Product("Iphone 5s", 999.99, 3),
                new Product("Epson EB-U05", 440.46, 1)
        };

        Scanner userInput = new Scanner(System.in);

        boolean continueModifying = true;
        while (continueModifying) {
            System.out.println("These are all available products:");
            for (Product product : products) {
                product.printProduct();
            }

            System.out.println("Choose what product you want to modify by entering the full name above:");
            String chosenProduct = userInput.nextLine();

            Product chosen = null;
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(chosenProduct)) {
                    chosen = product;
                    break;
                }
            }

            if (chosen != null) {
                System.out.println("Choose 1 for modifying price and Choose 2 for modifying amount:");
                int chosenModification = userInput.nextInt();
                userInput.nextLine();
                if (chosenModification == 1) {
                    chosen.changePrice();
                } else if (chosenModification == 2) {
                    chosen.changeQuantity();
                } else {
                    System.out.println("Invalid modification choice.");
                }
            } else {
                System.out.println("Product not found.");
            }

            System.out.println("Do you want to continue modifying products? (yes/no)");
            String continueChoice = userInput.nextLine();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                continueModifying = false;
            }
        }

        userInput.close();
    }
}
