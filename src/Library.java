import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<Reader> readers;

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public Library(List<Book> books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
    }
    public List<Book> addBook(Book book) {
        books.add(book);
        return books;
    }
    public List<Reader> addReaders(Reader book) {
        readers.add(book);
        return readers;
    }
    public void addBookReader(Book book,Reader reader) {
        if(book.isAvailable) {
            reader.addBorrowedBooks(book);
            book.setAvailable(false);
        }
    }
    public void remBookReader(Book book,Reader reader) {
        if(reader.remBorrowedBooks(book)) {
            book.setAvailable(true);
        }
    }
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }

    public List<Book> searchByGenre(String genre) {
        List<Book> booksByGenre = new ArrayList<>();
        for (Book book : books) {
            if(book.getClass().equals(FictionBook.class)) {
                FictionBook fictionBook = (FictionBook) book;
                if(fictionBook.getGenre().equals(genre)) {
                    booksByGenre.add(book);
                }
            }
        }
        return booksByGenre;
    }
}
