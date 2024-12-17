import java.util.List;

public class Reader {
    String name;
    int id;
    List<Book> borrowedBooks;

    public Reader(String name, int id, List<Book> borrowedBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = borrowedBooks;
    }
    public boolean addBorrowedBooks(Book book) {
        return borrowedBooks.add(book);
    }
    public boolean remBorrowedBooks(Book book) {
        return borrowedBooks.remove(book);
    }
}
