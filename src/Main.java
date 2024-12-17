import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("In the dark", "Borochkov", "123",2019, true, "Psychological thriller");
        EducationalBook educationalBook = new EducationalBook("English Focus", "Daniel Brayshaw", "124",2005, true, "English", 1);
        List<Book> books = Arrays.asList(fictionBook, educationalBook);
        System.out.println(fictionBook.getInfo());
        System.out.println(educationalBook.getInfo());
        Library lib1 = new Library(books, new ArrayList<>());
        Reader reader1 = new Reader("Pasha", 1, new ArrayList<>());
        lib1.addBookReader(fictionBook, reader1);
        lib1.printBooks();
        for(Book book : lib1.searchByGenre("Psychological thriller")){
            System.out.println(book.getInfo());
        }
    }

}