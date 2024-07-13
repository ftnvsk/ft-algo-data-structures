package com.algodatastructures.ft.SOLID;

// Clasa pentru gestiunea la carti, care e practica singura ei responsabilitate
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Clasa pentru imprimarea la o carte fiind singura ei responsabilitate
class BookPrinter {
    public void print(Book book) {
        System.out.println("Se printeaza cartea cu titlul: " + book.getTitle() + " scrisa de: " + book.getAuthor());
    }
}

// Clasa pentru salvarea unei carti la o baza de date fiind singura ei responsabilitate
class BookRepository {
    public void save(Book book) {
        System.out.println("Stocam cartea: " + book.getTitle() + " scrisa de " + book.getAuthor());
    }
}

// Exemplu de utilizare
public class SingleResponsibility {
    public static void main(String[] args) {
        Book book = new Book("SHOGUN", "James Clavell");
        BookPrinter printer = new BookPrinter();
        BookRepository repository = new BookRepository();

        printer.print(book);
        repository.save(book);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}