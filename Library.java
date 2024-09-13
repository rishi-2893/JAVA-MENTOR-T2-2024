import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Array to store books
        Book[] books = new Book[n];

        // Adding books to the library
        for (int i = 0; i < n; i++) {
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            String isbn = scanner.nextLine();
            books[i] = new Book(title, author, isbn);
        }

        // ISBN to search for
        String searchIsbn = scanner.nextLine();

        // Search for the book by ISBN and display details
        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equals(searchIsbn)) {
                book.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
