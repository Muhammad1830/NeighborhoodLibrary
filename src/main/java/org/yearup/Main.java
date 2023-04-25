package org.yearup;

import java.util.Scanner;
import org.yearup.books;


public class Main

{

    public static void main(String[] args)

    {
        class Book

        {
            private int id;
            private String isbn;
            private String title;
            private boolean isCheckedOut;
            private String checkedOutTo;
            private boolean isCheckedIn;
            private String checkedInTo;

            public Book(int id, String isbn, String title)

            {

                this.id = id;
                this.isbn = isbn;
                this.title = title;
                this.isCheckedOut = false;
                this.checkedOutTo = "";

            }


            public int getId()

            {

                return this.id;

            }

            public String getTitle() {
                return this.title;
            }

            public String getIsbn()

            {

                return this.isbn;

            }

            public void checkOut(String name)
            {

                this.isCheckedOut = true;
                this.checkedOutTo = name;

            }

            public void checkIn()

            {

                this.isCheckedIn = false;
                this.checkedInTo = "";

            }

        }

        Book[] books = new Book[5];
        books[0] = new Book(1, "9780140449112", "The Odyssey");
        books[1] = new Book(2, "9780061122415", "To Kill a Mockingbird");
        books[2] = new Book(3, "9780385533225", "The Goldfinch");
        books[3] = new Book(4, "9780307277679", "The Road");
        books[4] = new Book(5, "9780307387297", "The Girl with the Dragon Tattoo");


        Scanner input = new Scanner(System.in);
        while (true)

        {

            System.out.println("Welcome to the Neighborhood Library!");
            System.out.println("Please choose an option:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");



            System.out.println("Available Books:");
            for (Book book : books)
            {

                if (!book.isCheckedOut())

                {

                    System.out.println(book.getId() + ". " + book.getIsbn() + " " + book.getTitle());

                }

            }

            System.out.println("Please enter the ID of the book you want to check out, or 0 to go back to the main menu:");
            int bookId = input.nextInt();
            if (bookId == 0)

            {

                return;

            }

            Book selectedBook = null;
            for (Book book : books)

            {

                if (book.getId() == bookId)
                {

                    selectedBook = book;
                    break;

                }

            }

            if (selectedBook != null)

            {

                System.out.println("Please enter your name:");
                String name = input.next();
                selectedBook.checkOut(name);
                System.out.println("You have checked out " + selectedBook.getTitle() + ".");
            }

            else

            {

                System.out.println("Invalid book ID.");

            }

        }

    }

}