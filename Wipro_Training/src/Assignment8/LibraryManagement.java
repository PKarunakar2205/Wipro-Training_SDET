package Assignment8;

import java.util.HashMap;
import java.util.Map;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author);
    }

    
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Map<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python Guide", "Guido");
        Book b3 = new Book("C++ Basics", "Bjarne");

        library.put(b1, true);
        library.put(b2, true);
        library.put(b3, true);

        library.put(b2, false);

        
        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {
            Book book = entry.getKey();
            Boolean available = entry.getValue();

            System.out.println(book.title + " by " + book.author +
                    " -> " + (available ? "Available" : "Issued"));
        }
    }
}

