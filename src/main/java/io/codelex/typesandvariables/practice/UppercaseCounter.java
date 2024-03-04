package src.main.java.io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class UppercaseCounter {
    public static void main(String[] args){
        String userPrompt;
        int upperCaseCount=0;
        Scanner promptScanner = new Scanner(System.in);
        System.out.println("Enter a string to find out how menny uppercase letters there are!");
        userPrompt = promptScanner.nextLine(); //nextline bc next stops at whitespace
        for(int i = 0; i< userPrompt.length();i++){
            if(Character.isUpperCase(userPrompt.charAt(i))){
                upperCaseCount++;
            }
        }
        System.out.printf("The string %s contains %d uppercase letters", userPrompt, upperCaseCount );
    }
}