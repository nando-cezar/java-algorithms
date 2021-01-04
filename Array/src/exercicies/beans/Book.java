package exercicies.beans;

import java.util.Calendar;

public class Book implements Comparable<Book>{
    
    private String name;
    private String isbn;
    private Calendar year;
    private String author;
    private int priority;

    public Book() {
    }

    public Book(String name, String isbn, Calendar year, String author, int priority){
        this.name = name;
        this.isbn = isbn;
        this.year = year;
        this.author = author;
        this.priority = priority;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString(){
            return getName();
    }

    @Override
    public int compareTo(Book book){
        if(this.priority > book.getPriority()){
            return 1;
        } else if (this.priority < book.getPriority()){
            return -1;
        }

        return 0;
    }
}
