import javax.print.attribute.HashDocAttributeSet;
import java.util.*;
import java.io.*;

public class dataFile {

    private String file;

    public dataFile(String file) {
        this.file = file;
    }

    public void save(ArrayList list) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(this.file));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            pw.write(list.get(i).toString() + "\n");
        }
        pw.flush();
    }

    public ArrayList<Person> loadPerson() {

        BufferedReader bufReader = null;
        ArrayList<Person> listOfLines = null;
        try {
            bufReader = new BufferedReader(new FileReader(this.file));
            listOfLines = new ArrayList<>();
            String line = null;
            line = bufReader.readLine();

            while (line != null) {
                String PersonName = line.substring(line.indexOf("(") + 1, line.indexOf(","));
                String PersonLastName = line.substring(line.indexOf(",") + 1, line.lastIndexOf(","));
                int PersonAge = Integer.parseInt(line.substring(line.lastIndexOf(",") + 1, line.indexOf(")")));
                listOfLines.add(new Person(PersonName, PersonLastName, PersonAge));
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }

    public void saveBooks(ArrayList<Book> list) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(this.file,true));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            pw.write((int) list.get(i).getYear()+"\n");
            pw.write(list.get(i).getAuthor() +"\n");
            pw.write(list.get(i).getTitle() +"\n");
            pw.write(list.get(i).getGenre() +"\n");
        }
        pw.flush();
    }


    public ArrayList<Book> loadBooks() {

        BufferedReader bufReader = null;
        ArrayList<Book> listOfLines = null;
        try {
            bufReader = new BufferedReader(new FileReader(this.file));
            listOfLines = new ArrayList<>();
            String line = null;
            line = bufReader.readLine();


            while (line != null) {

                int bookYear = Integer.parseInt(line);
                String authorName = bufReader.readLine();
                String bookTitle = bufReader.readLine();
                String bookgenre = bufReader.readLine();
                listOfLines.add(new Book(bookYear, authorName, bookTitle,bookgenre));
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }

    public ArrayList<Book> loadHistory(Reader objReader) {

        BufferedReader bufReader = null;
        ArrayList<Book> ReaderhistoryList = null;
        try {
            bufReader = new BufferedReader(new FileReader(this.file));
            ReaderhistoryList = new ArrayList<>();
            String line = null;
            line = bufReader.readLine();

            while (line != null) {
                int bookYear = Integer.parseInt(line);
                String authorName = bufReader.readLine();
                String bookTitle = bufReader.readLine();
                String bookgenre = bufReader.readLine();
                String ReaderFirstName = bufReader.readLine();
                String ReaderLastName = bufReader.readLine();

                if (ReaderFirstName.equals(objReader.getFirstName()) && ReaderLastName.equals(objReader.getLastName())) {
                    ReaderhistoryList.add(new Book(bookYear,authorName,bookTitle,bookgenre));
                }
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ReaderhistoryList;
    }

    public void saveHistory(Book objBook, Reader objReader ) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(this.file,true));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

            pw.write((int) objBook.getYear()+"\n");
            pw.write(objBook.getAuthor() +"\n");
            pw.write(objBook.getTitle() +"\n");
            pw.write(objBook.getGenre() +"\n");
            pw.write(objReader.getFirstName() +"\n");
            pw.write(objReader.getLastName() +"\n");
            pw.flush();
    }

    public ArrayList<Book> loadTakenBooks() {

        BufferedReader bufReader = null;
        ArrayList<Book> listOfLines = null;
        try {
            bufReader = new BufferedReader(new FileReader(this.file));
            listOfLines = new ArrayList<>();
            String line = null;
            line = bufReader.readLine();
            while (line != null) {
                int bookYear = Integer.parseInt(line);
                String authorName = bufReader.readLine();
                String bookTitle = bufReader.readLine();
                String bookgenre = bufReader.readLine();
                String readerName = bufReader.readLine();
                String readerLastName = bufReader.readLine();

                listOfLines.add(new Book(bookYear, authorName, bookTitle,bookgenre));
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }











}