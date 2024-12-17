public class Book {
    String title;
    String author;
    String isbn;
    int years;
    boolean isAvailable;

    public Book(String title, String author, String isbn, int years, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.years = years;
        this.isAvailable = isAvailable;
    }

    public String getInfo() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", years=" + years +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
