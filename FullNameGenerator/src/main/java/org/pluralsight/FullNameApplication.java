package org.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = getStringInput(scanner, "Enter your first name: ");
        String middleName = getStringInput(scanner, "Enter your middle name: ");
        String lastName = getStringInput(scanner, "Enter your last name: ");
        String suffix = getStringInput(scanner, "Enter your suffix name: ");

        printFormattedName(firstName, middleName, lastName, suffix);

    }

    public static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static String capitalizeFirstChar(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void printFormattedName(String firstName, String middleName, String lastName, String suffix) {
        firstName = " " + capitalizeFirstChar(firstName);
        lastName = " " + capitalizeFirstChar(lastName);

        if(!middleName.isEmpty()) middleName = " " + capitalizeFirstChar(middleName);
        if(!suffix.isBlank()) suffix = ", " + suffix;

        System.out.printf("Full Name:%s%s%s%s", firstName, middleName, lastName, suffix);
    }
}
