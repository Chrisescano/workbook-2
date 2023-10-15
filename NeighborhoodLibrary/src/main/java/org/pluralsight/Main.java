package org.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Book[] libraryCollection = new Book[20];
    static int amountsBooksAvailable = 5;

    static String homeScreenPrompt = "Here is what you can do:\n  (A) - Shows available books\n  (C) - Shows checked out books\n" +
            "  (Q) - Quit the program\nType in your command: ";
    static String availableBooksPrompt = "Here is what you can do:\n  (S) - Select a book\n  (R) - Return back to main menu\n" +
            "Type in your command: ";

    public static void main(String[] args) {
        //making up books
        libraryCollection[0] = new Book(4, "0-6589-5603-5", "Three Little Piggies And Egg");
        libraryCollection[1] = new Book(10, "", "The Spoon That Jumped Over The Moon - Conspiracy Edition");
        libraryCollection[2] = new Book(234, "", "Pluralsight - Learn to Code Academy");
        libraryCollection[3] = new Book(678, "", "How To Throw A Carrot");
        libraryCollection[4] = new Book(12, "", "The Answer To Life is 42");

        boolean isDone = false;

        //Store Home Screen
        System.out.println("Welcome to the Pluralsight library!");

        while (!isDone) {
            char command = getCharInput(scanner, homeScreenPrompt);
            switch (command) {
                case 'A':
                    availableBooksMenu();
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

    public static void availableBooksMenu() {
        System.out.println("Here is a list of all the available books:");

        while(true) {
            char command = getCharInput(scanner, availableBooksPrompt);
            switch (command) {
                case 'S':
                    System.out.println("Showing available books...");
                    break;
                case 'R':
                    System.out.println("Returning to main menu...");
                    return;
                default:
                    System.out.println("Sorry, that is not a valid command - type: S or R");
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
