import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader extends Person{
    private ArrayList<Book> HistoryofBooks = new ArrayList<>();
    private ArrayList<Book> ReadingBooks = new ArrayList<>();

    public Reader(String firstName, String lastName, int age) {
        super(firstName,lastName,age);
    }
    public Reader(String firstName, String lastName) {
        super(firstName,lastName);
    }

}
