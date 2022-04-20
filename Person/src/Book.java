public class Book implements Comparable <Book>{

    private String title, author,genre;
    private int year;

    public Book(){
        year = 9999;
        author = null;
        title = null;
        genre = null;

        }

public Book( int year, String author,String title, String genre) {
            this.year = year;
            this.author = author;
            this.title = title;
            this.genre = genre;
}


    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getYear()
    {
        return year;
    }
    public String getGenre()
    {
        return genre;
    }

    public String toString(){
        return "Year: " +(int)year +" Author: "+author+ " Title: "+title+" Genre: "+ genre+'\n';
    }

    public int compareTo(Book o) {
        int titleCheck = this.getTitle().compareToIgnoreCase(o.getTitle());
        int genreCheck = this.getGenre().compareToIgnoreCase(o.getGenre());
        int yearCheck = Integer.compare((int) this.year, (int) o.year);

        if (titleCheck != 0) {
            return titleCheck; }
        else if (genreCheck != 0 ) {
            return genreCheck;
        }
        else {
            return yearCheck;
        }
    }
}
