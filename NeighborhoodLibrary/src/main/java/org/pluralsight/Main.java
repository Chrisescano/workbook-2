package org.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Book[] libraryCollection = new Book[20];
    static int currentAvailableBooks = 5;

    static String homeScreenPrompt = "Here is what you can do:\n  (A) - Shows available books\n  (C) - Shows checked out books\n" +
            "  (Q) - Quit the program\nType in your command: ";
    static String availableBooksPrompt = "Here is what you can do:\n  (C) - Check out book\n    if Checking-out: type <book-name> OR <book-isbn> OR <book-id>" +
            "\n  (R) - Return back to main menu\nType in your command: ";
    static String enterNamePrompt = "Please enter your name: ";

    public static void main(String[] args) {
        //making up books
        libraryCollection[0] = new Book(4, "0-6589-5603-5", "Three Little Piggies And Egg");
        libraryCollection[1] = new Book(10, "0-3520-4533-7", "The Spoon That Jumped Over The Moon - Conspiracy Edition");
        libraryCollection[2] = new Book(234, "0-2322-6050-8", "Pluralsight - Learn to Code Academy");
        libraryCollection[3] = new Book(678, "0-5126-0507-6", "How To Throw A Carrot");
        libraryCollection[4] = new Book(12, "0-8720-8134-6", "The Answer To Life is 42");

        boolean isDone = false;

        //Store Home Screen
        System.out.println("Welcome to the Pluralsight library!");

        while (!isDone) {
            char command = getCharInput(scanner, homeScreenPrompt);
            switch(command) {
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
        //listing the books
        for(int i = 0; i < currentAvailableBooks; i++) {
            if(!libraryCollection[i].isCheckedOut()) {
                System.out.println(libraryCollection[i]);
            }
        }

        //logic for commands
        while(true) {
            String command = getStringInput(scanner, availableBooksPrompt);
            switch(command.toUpperCase().charAt(0)) {
                case 'C':
                    checkOutBook(command);
                    break;
                case 'R':
                    System.out.println("Returning to main menu...");
                    return;
                default:
                    System.out.println("Sorry, that is not a valid command - type: S or R");
            }
        }
    }

    public static void checkOutBook(String bookInfo) {
        String[] tokens = bookInfo.split(" ");

        for(int i = 0; i < currentAvailableBooks; i++) {
            Book book = libraryCollection[i];
            if (    //will check title first, then id, then isbn
                    book.getTitle().equalsIgnoreCase(tokens[1]) ||
                    String.valueOf(book.getId()).equalsIgnoreCase(tokens[1]) ||
                    book.getIsbn().equalsIgnoreCase(tokens[1])
            ) {
                String name = getStringInput(scanner, enterNamePrompt);
                libraryCollection[i].checkOut(name);
            }
        }
    }

    public static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static char getCharInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        char input = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine(); //clears the buffer
        return input;
    }
}
