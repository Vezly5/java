import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        File Books = new File("Books.txt");
        File Readers = new File("Readers.txt");

        try {
            ArrayList<Person> PersonList = new ArrayList<>();
            PersonList.add(new Person("Jonas", "PavardC", 3));
            PersonList.add(new Person("VardaB", "PavardC", 2));
            PersonList.add(new Person("Tadas", "PavardC", 5));
            PersonList.add(new Person("VardaA", "PavardC", 4));
            PersonList.add(new Person("VardaA", "PavardA", 20));

            dataFile failas = new dataFile("Readers.txt");
            failas.save(PersonList);
            ArrayList newPersonList = failas.loadPerson();
            newPersonList.add(new Person("Bandymas", "Pridetas", 20));
            failas.save(newPersonList);

            ArrayList<Person> newbandymasList = new ArrayList<>();
            newbandymasList = failas.loadPerson();

//            for (int i = 0; i < newbandymasList.size(); ++i) {
//                System.out.println(newbandymasList.get(i).getFirstName());
//                System.out.println(newbandymasList.get(i).getLastName());
//                System.out.println(newbandymasList.get(i).getAge());
//            }



//            BookList.add(new Book(2000, "Autorius PavardeA","Gera istorija","Drama"));

            ArrayList<Book> BookList = new ArrayList<>();
            dataFile Knygufailas = new dataFile("Books.txt");
            BookList = Knygufailas.loadBooks();

            ArrayList<Book> TakenBookList = new ArrayList<>();
            dataFile TakenFile = new dataFile("TakenBooks.txt");
            TakenBookList = TakenFile.loadTakenBooks();




            Author Autorius = new Author("Autorius", "PavardeB", 20);


            System.out.println("====================VISOS KNYGOS======================");
            for (int i = 0; i < BookList.size(); ++i) {
                System.out.println(i + "," + BookList.get(i).getYear() + "," + BookList.get(i).getAuthor() + "," + BookList.get(i).getGenre() + "," + BookList.get(i).getTitle());
//
            }
            BookList.removeAll(TakenBookList);
                System.out.println("====================AVAIABLE KNYGOS======================");
            for (int i = 0; i < BookList.size(); ++i) {
                System.out.println(i + "," + BookList.get(i).getYear() + "," + BookList.get(i).getAuthor() + "," + BookList.get(i).getGenre() + "," + BookList.get(i).getTitle());
               }
           ArrayList test = Library.availableBooks();
            System.out.println("====================Test KNYGOS======================");
            for (int i = 0; i < test.size(); ++i) {
                System.out.println(i + "," + test.get(i).toString());
            }





//            Reader Jonas = new Reader("Jonas","Mazylis");
//            dataFile HistoryFailas = new dataFile("./History.txt");
//            HistoryFailas.saveHistory(newBookList.get(1),Jonas);
//            HistoryFailas.saveHistory(newBookList.get(2),Jonas);
//            HistoryFailas.saveHistory(newBookList.get(3),Jonas);
//            HistoryFailas.saveHistory(newBookList.get(4),Jonas);
//
//           ArrayList <Book> JonoKnygos =  HistoryFailas.loadHistory(Jonas);
//            for (int i = 0; i < JonoKnygos.size(); ++i) {
//                System.out.println(Jonas.getFirstName()+" Skaite "+","+JonoKnygos.get(i).getYear()+","+JonoKnygos.get(i).getAuthor()+","+JonoKnygos.get(i).getGenre()+","+JonoKnygos.get(i).getTitle());
//
//            }


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

            } catch(InputMismatchException e ){
                System.out.print(" Neteisingai ivesta");
            } catch(Exception e){
                e.printStackTrace();
            }
        }}

