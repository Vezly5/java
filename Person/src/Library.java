import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Library {
    private ArrayList<Book> bookInventory;

    public Library (){
        bookInventory = new ArrayList<Book>();

    }
    public void addBook(Book book){
        bookInventory.add(book);
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
