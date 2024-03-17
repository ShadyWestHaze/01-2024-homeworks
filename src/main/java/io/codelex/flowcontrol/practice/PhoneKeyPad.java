package src.main.java.io.codelex.flowcontrol.practice;


import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String userString;
        boolean invalidCharFound = false;

        System.out.println("Input a text so that it converts to a sequence of keypad digits ");
        userString = userInput.next().toLowerCase();
        char[] userCharArr = userString.toCharArray();


        for (int i = 0; i < userCharArr.length; i++) {

            switch (userCharArr[i]) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print(9);
                    break;
                default:
                    invalidCharFound = true;
                    break;
            }
        }

        if (invalidCharFound) {
            System.out.println("Some of the characters might not have been letters");
        }
    }
}



