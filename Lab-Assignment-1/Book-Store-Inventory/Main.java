public class Main {
    public static void main(String[] args) {
        // Create a BookStore instance
        BookStore store = new BookStore();

        // Add books to the bookstore
        store.addBook(new Book("Java Programming", "John Doe", "1234567890", 29.99, 10));
        store.addBook(new Book("Data Structures", "Jane Smith", "0987654321", 39.99, 5));
        store.addBook(new Book("Algorithms", "James Brown", "1112131415", 49.99, 7));

        // Update stock quantity for a book
        store.updateStock("0987654321", 12);

        // Remove a book from the inventory
        store.removeBook("1234567890");

        // Print the current inventory
        store.printInventory();
    }
}