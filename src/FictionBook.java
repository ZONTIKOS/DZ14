public class FictionBook extends Book {
    String genre;


    public FictionBook(String title, String author, String isbn, int years, boolean isAvailable, String genre) {
        super(title, author, isbn, years, isAvailable);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getInfo() {
        return "FictionBook{" +
                "genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", years=" + years +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
