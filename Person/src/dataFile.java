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
            FileOutputStream fo = new FileOutputStream(this.file);
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

    public void SaveBooks(ArrayList<Book> list) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(this.file));
            FileOutputStream fo = new FileOutputStream(this.file);
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
}