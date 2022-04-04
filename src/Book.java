import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        ArrayList<Book> bookArrayList=populateLibrary();
        bookArrayList.stream().filter(book->{
            return book.title.endsWith("green")&&book.title.endsWith("red");
        }).forEach(System.out::println);
    }

    private static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book("Alice walker","The color purple"));
        books.add(new Book("Alice walker","The color green"));
        books.add(new Book("Alice walker","The color red"));
        books.add(new Book("Alice walker","The color blue"));
        books.add(new Book("Alice walker","The color yellow"));
        return books;

    }
}
