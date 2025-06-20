import java.util.*;

public class LibrarySearch {

    static class Book {
        int bookId;
        String title;
        String author;

        Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        public String toString() {
            return bookId + " | " + title + " | " + author;
        }
    }

    static Book linearSearch(Book[] books, String targetTitle) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(targetTitle)) return b;
        }
        return null;
    }

    static Book binarySearch(Book[] books, String targetTitle) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(targetTitle);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(301, "The Alchemist", "Paulo Coelho"),
            new Book(302, "Atomic Habits", "James Clear"),
            new Book(303, "Clean Code", "Robert C. Martin"),
            new Book(304, "Think and Grow Rich", "Napoleon Hill")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title to search: ");
        String title = sc.nextLine();

        System.out.println("\nUsing Linear Search:");
        Book found1 = linearSearch(books, title);
        System.out.println(found1 != null ? found1 : "Book not found.");

        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        System.out.println("\nUsing Binary Search:");
        Book found2 = binarySearch(books, title);
        System.out.println(found2 != null ? found2 : "Book not found.");
    }
}
