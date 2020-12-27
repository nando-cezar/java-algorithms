package exercicies.beans;

import java.util.Calendar;

public class Book {
    
    private String name;
    private String isbn;
    private Calendar year;
    private String author;

    public Book() {
    }

    public Book(String name, String isbn, Calendar year, String author){
        this.name = name;
        this.isbn = isbn;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Calendar getYear() {
        return year;
    }

    public void setYear(Calendar year) {
        this.year = year;
    }
}
