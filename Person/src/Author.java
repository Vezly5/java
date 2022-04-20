import java.util.ArrayList;

public class Author extends Person{
    private ArrayList<Book> AuthorBooks = new ArrayList<>();

    public Author() {
        super();
    }
    public Author(String firstName, String lastName, int age) {
        super(firstName,lastName,age);
    }
    public Author(String firstName, String lastName) {
        super(firstName,lastName);
    }

    public ArrayList<Book> WrittenBooks(ArrayList<Book> AllBokList) {
        for (int i = 0; i < AllBokList.size(); ++i) {
           if ((this.getFirstName()+" "+this.getLastName()).equals(AllBokList.get(i).getAuthor())) {
               AuthorBooks.add(AllBokList.get(i));
           }
        }
        return AuthorBooks;
    }
}
