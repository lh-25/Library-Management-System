import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private final List<Book> books;
    private final List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public Optional<Book> findBook(String id) {
        return books.stream().filter(book -> book.getId().equalsIgnoreCase(id)).findFirst();
    }

    public void displayBooks() {
        books.forEach(System.out::println);
    }

    public void displayMembers() {
        members.forEach(System.out::println);
    }

    public void borrowBook(String bookId, String memberId) {
        Optional<Book> book = findBook(bookId);
        Optional<Member> member = findMember(memberId);

        if (book.isPresent() && member.isPresent()) {
            member.get().borrowBook(book.get());
        } else {
            System.out.println("Book or Member not found.");
        }
    }

    public void returnBook(String bookId, String memberId) {
        Optional<Book> book = findBook(bookId);
        Optional<Member> member = findMember(memberId);

        if (book.isPresent() && member.isPresent()) {
            member.get().returnBook(book.get());
        } else {
            System.out.println("Book or Member not found.");
        }
    }

    private Optional<Member> findMember(String id) {
        return members.stream().filter(member -> member.getId().equalsIgnoreCase(id)).findFirst();
    }
}
