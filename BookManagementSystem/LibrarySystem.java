package BookManagementSystem;
import java.util.*;
public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library(); // Create Library instance

        // --- Add Books ---

        
        library.addBook(new Book(1, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling",562.67));
        library.addBook(new Book(2, "AV king Hobbit", "J.R.R. Tolkien",456.34));
        library.addBook(new Book(24, "The Hobbit", "J.R.R. Tolkien",896.34));
        library.addBook(new Book(3, "Jack Sparrow", "J.K. Rowling",556.88));
        library.addBook(new Book(3, "Jack Sparrow", "J.K. Rowling",500.88));

        // --- Register Members ---
        Person m1 = new Member(101, "Alice");
        Person m2 = new Librarian(102, "Bob");
        library.registerMember(m1);
        library.registerMember(m2);

        // --- Show Roles ---
        m1.showRole(); // prints: I am a library member
        m2.showRole(); // prints: I am a library member
        Collections.sort(library.books, new BookComparator());

        // --- Show Available Books ---
        System.out.println("\nAvailable books:");
        library.showAvailableBooks();
        
        
        
        
//        library.getHighestPrice();
//        library.getGroupBookAuthor();
        try {
			System.out.println(library.borrowBook(101,1));
		} catch (BookNotAvailableException e) {
			// TODO Auto-generated catch block
			System.out.println("not got book");
		}
        
//        library.countAvailablity();
//        
//        library.duplicateTitles();
//        library.sortBooksByTitleId();
//        library.shortestTitle();
//        library.distinctAuthors();
        
        
        
        

        // --- Borrow a Book ---
//        try {
//            System.out.println("\nAlice is borrowing book ID 1...");
//            library.borrowBook(m1.getId(), 1); // Alice borrows Harry Potter 1
//
//            // Try borrowing the same book again (should throw exception)
//            System.out.println("Bob tries to borrow the same book ID 1...");
//            library.borrowBook(m2.getId(), 1);
//        } catch (BookNotAvailableException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//
//        // --- Return the Book ---
//        System.out.println("\nReturning book ID 1...");
//        try {
//			library.returnBook(1);
//		} catch (BookNotAvailableException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//
//        // --- Show Available Books Again ---
//        System.out.println("\nAvailable books after returning:");
//        library.showAvailableBooks();
//
//        // --- Show Books by Author ---
//        System.out.println("\nBooks by J.K. Rowling:");
//        library.showBooksByAuthor("J.K. Rowling");
    }
}

