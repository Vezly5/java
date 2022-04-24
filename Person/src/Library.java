import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookInventory;

    public Library (){
        bookInventory = new ArrayList<Book>();

    }
    public void addBook(Book book){
        bookInventory.add(book);
    }
    public static ArrayList<Book> availableBooks(){
        ArrayList<Book> BookList = new ArrayList<>();
        dataFile Knygufailas = new dataFile("Books.txt");
        BookList = Knygufailas.loadBooks();

        ArrayList<Book> TakenBookList = new ArrayList<>();
        dataFile TakenFile = new dataFile("TakenBooks.txt");
        TakenBookList = TakenFile.loadTakenBooks();

        BookList.removeAll(TakenBookList);
        return BookList;


    }

    public String toString(){
        String inventoryStr = "";
        for (int i=0; i<bookInventory.size(); i++){
            Book a = bookInventory.get(i);
            inventoryStr = inventoryStr + a.toString();
        }
        return ""+inventoryStr;
    }



}
