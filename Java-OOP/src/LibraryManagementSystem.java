public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("1", "1984", "George Orwell"));
        library.addBook(new Book("2", "To Kill a Mockingbird", "Harper Lee"));

        // Adding members to the library
        Member alice = new Member("1", "Alice");
        Member bob = new Member("2", "Bob");
        library.addMember(alice);
        library.addMember(bob);

        // Display books and members
        System.out.println("Books in the library:");
        library.displayBooks();
        System.out.println("\nMembers of the library:");
        library.displayMembers();

        // Borrowing books
        library.borrowBook("1", "1");
        library.borrowBook("2", "2");

        // Display books and members after borrowing
        System.out.println("\nBooks in the library after borrowing:");
        library.displayBooks();
        System.out.println("\nMembers of the library after borrowing:");
        library.displayMembers();

        // Returning books
        library.returnBook("1", "1");

        // Display books and members after returning
        System.out.println("\nBooks in the library after returning:");
        library.displayBooks();
        System.out.println("\nMembers of the library after returning:");
        library.displayMembers();
    }
}
