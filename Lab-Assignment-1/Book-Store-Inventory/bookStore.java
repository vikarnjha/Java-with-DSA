import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> inventory;

    // Constructor
    public BookStore() {
        inventory = new ArrayList<>();
    }

    // Add a book to the inventory
    public void addBook(Book book) {
        inventory.add(book);
    }

    // Remove a book from the inventory by ISBN
    public void removeBook(String isbn) {
        inventory.removeIf(book -> book.getIsbn().equals(isbn));
    }

    // Update stock quantity of a book by ISBN
    public void updateStock(String isbn, int quantity) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                book.setStockQuantity(quantity);
                break;
            }
        }
    }

    // Print all books in the inventory
    public void printInventory() {
        System.out.println("Inventory:");
        for (Book book : inventory) {
            System.out.println(book);
        }
    }
}
