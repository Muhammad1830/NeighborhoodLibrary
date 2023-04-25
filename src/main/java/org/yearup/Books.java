package org.yearup;

import java.util.Scanner;

public class books
{
    public static void showAvailableBooks, showCheckedOutBooks (Scanner input, Book[] books)
    {
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                showAvailableBooks (input, books);
                break;
            case 2:
                showCheckedOutBooks(input, books);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
        }
    }
}