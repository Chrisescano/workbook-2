package org.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String homeScreenPrompt = "Here is what you can do:\n  (A) - Shows available books\n  (C) - Shows checked out books\n" +
                "  (Q) - Quit the program\nType in your command: ";

        Scanner scanner = new Scanner(System.in);
        Book[] libraryCollection = new Book[20];

        boolean isDone = false;

        //Store Home Screen
        System.out.println("Welcome to the Pluralsight library!");

        while (!isDone) {
            char command = getCharInput(scanner, homeScreenPrompt);
            switch (command) {
                case 'A':
                    System.out.println("Show available books...");
                    break;
                case 'C':
                    System.out.println("Show checked out books...");
                    break;
                case 'Q':
                    System.out.println("Quitting the program");
                    isDone = true;
                    break;
                default:
                    System.out.println("Sorry, that is not a valid command - type: A, C, or Q");
            }
        }
    }

    public static char getCharInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        char input = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine(); //clears the buffer
        return input;
    }
}
