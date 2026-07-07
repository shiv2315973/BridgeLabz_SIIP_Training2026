import java.util.Scanner;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

public class SmartLibrarySystem {
    public static void borrowBook(String[] availableBooks, String requestedBook) throws BookNotAvailableException {
        for (String book : availableBooks) {
            if (book.equalsIgnoreCase(requestedBook)) {
                System.out.println(requestedBook + " has been issued.");
                return;
            }
        }
        throw new BookNotAvailableException("Book not available: " + requestedBook);
    }

    public static void main(String[] args) {
        String[] availableBooks = {"Java Basics", "Data Structures", "Algorithms"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book name to borrow: ");
        String requestedBook = sc.nextLine();

        try {
            borrowBook(availableBooks, requestedBook);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
