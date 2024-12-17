public class EducationalBook extends Book {
    String subject;
    int level;

    public EducationalBook(String title, String author, String isbn, int years, boolean isAvailable, String subject, int level) {
        super(title, author, isbn, years, isAvailable);
        this.subject = subject;
        this.level = level;
    }

    @Override
    public String getInfo() {
        return "EducationalBook{" +
                "level=" + level +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", years=" + years +
                ", isAvailable=" + isAvailable +
                '}';
    }
}