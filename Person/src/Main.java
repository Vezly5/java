import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        File Books = new File("Books.txt");
        File Readers = new File("Readers.txt");

        try {
            ArrayList<Person> PersonList = new ArrayList<>();
            PersonList.add(new Person("Jonas", "PavardC",3));
            PersonList.add(new Person("VardaB", "PavardC",2));
            PersonList.add(new Person("Tadas", "PavardC",5));
            PersonList.add(new Person("VardaA", "PavardC",4));
            PersonList.add(new Person("VardaA", "PavardA",20));

            dataFile failas = new dataFile("Readers.txt");
            failas.save(PersonList);
            ArrayList newPersonList =  failas.loadPerson();
            newPersonList.add(new Person("Bandymas", "Pridetas",20));
            failas.save(newPersonList);

            ArrayList<Person> newbandymasList =  new ArrayList<>();
                newbandymasList = failas.loadPerson();

            for (int i = 0; i < newbandymasList.size(); ++i) {
                System.out.println(newbandymasList.get(i).getFirstName());
                System.out.println(newbandymasList.get(i).getLastName());
                System.out.println(newbandymasList.get(i).getAge());
            }



            ArrayList<Book> BookList = new ArrayList<>();
            BookList.add(new Book(2000, "Autorius PavardeA","Gera istorija","Drama"));
            BookList.add(new Book(2001, "Autorius PavardeA","Gera istorija2","Drama"));
            BookList.add(new Book(2002, "Tadas PavardeC","Gera istorija3","Drama"));
            BookList.add(new Book(2003, "Kitastadas PavardeD","Bloga istorija","Drama"));
            BookList.add(new Book(2004, "Tadas PavardeC","seip istorija","Fantastika"));
            BookList.add(new Book(2005, "Autorius PavardeB","A istorija","Fantastika"));
            BookList.add(new Book(2006, "Autorius PavardeB","B istorija","Fantastika"));
            BookList.add(new Book(2007, "Autorius PavardeB","C istorija","Detektyvas"));
            BookList.add(new Book(2008, "Autorius PavardeC","D istorija","Detektyvas"));
            BookList.add(new Book(2020, "Autorius PavardeC","E istorija","Detektyvas"));

            dataFile Knygufailas = new dataFile("Books.txt");
            Knygufailas.SaveBooks(BookList);
            ArrayList<Book> newBookList = Knygufailas.loadBooks();

            for (int i = 0; i < newBookList.size(); ++i) {
                System.out.println(newBookList.get(i).getYear());
                System.out.println(newBookList.get(i).getAuthor());
                System.out.println(newBookList.get(i).getGenre());
            }

            Author Autorius = new Author("Autorius","PavardeB",20);
            System.out.println(Autorius.getFirstName()+" "+Autorius.getLastName());
            System.out.println(newBookList.get(5).getAuthor());
            System.out.println(newBookList.get(6).getAuthor());

            ArrayList<Book> PavarbeBKnygos = Autorius.WrittenBooks(newBookList);
            System.out.println("================================================");
            for (int i = 0; i < PavarbeBKnygos.size(); ++i) {
                System.out.println(PavarbeBKnygos.get(i).getYear());
                System.out.println(PavarbeBKnygos.get(i).getAuthor());
                System.out.println(PavarbeBKnygos.get(i).getGenre());
                System.out.println(PavarbeBKnygos.get(i).getTitle());
            }




//            System.out.println("===================");
//            for (int i = 0; i < PersonList.size(); ++i) {
//                System.out.println(PersonList.get(i).toString());
//            }
//            System.out.println("===================");
//            Collections.sort(PersonList);
//            for (int i = 0; i < PersonList.size(); ++i) {
//                System.out.println(PersonList.get(i).toString());
//            }
//            Book Knyga1 = new Book(1990,"Donatas","Java","Siaubas");
//            Book Knyga2 = new Book(1991,"Saulius","JavaA","Komedija");
//            Book Knyga3 = new Book(1993,"Justina","JavaB","Fantastika");
//            Book Knyga4 = new Book(1992,"Irmantas","JavaC","Drama");
//            Library AmazingLibrary = new Library();
//            AmazingLibrary.addBook(Knyga1);
//            AmazingLibrary.addBook(Knyga2);
//            AmazingLibrary.addBook(Knyga3);
//            System.out.println(AmazingLibrary.toString());
//            AmazingLibrary.addBook(Knyga4);
//            System.out.println(AmazingLibrary.toString());



//            int lastNameCheck =   PersonList.get(1).getLastName().compareToIgnoreCase(PersonList.get(2).getLastName());
//            int firstNameCheck =  PersonList.get(1).getFirstName().compareToIgnoreCase(PersonList.get(2).getFirstName());
//            int age1 = PersonList.get(1).getAge();
//            int age2 = PersonList.get(2).getAge();
//            int ageCheck = Integer.compare(age1,age2);
//            System.out.println("=====");
//            System.out.println(lastNameCheck);
//            System.out.println(firstNameCheck);
//            System.out.println(ageCheck);

        } catch (InputMismatchException e ) {
            System.out.print(" Neteisingai ivesta");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}

