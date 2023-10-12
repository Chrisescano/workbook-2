package org.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = getStringInput(scanner, "Enter your full name(<first> <last> OR <first> <middle> <last>): ");
        String[] tokens = fullName.split(" ");

        switch(tokens.length) {
            case 3:
                System.out.printf("First name  : %s\nMiddle name : %s\nLast name   : %s", tokens[0], tokens[1], tokens[2]);
                break;
            case 2:
                System.out.printf("First name  : %s\nMiddle name : (none)\nLast name   : %s", tokens[0], tokens[1]);
                break;
            default:
                System.out.println("Sorry, I couldn't parse that name");
        }
    }

    public static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}