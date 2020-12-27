package exercicies.battery;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;

import battery.Battery;
import exercicies.beans.Book;

public class Main4 {
    
    public static void main(String[] args){

        Book book = new Book();

        Stack<Book> battery = new Stack<Book>();

        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<=6; i++){
            
            System.out.println("Enserir livro");
            System.out.println();
            System.out.println("Nome do livro:");
            book.setName(scan.nextLine());
            System.out.println("Isbn do livro");
            book.setIsbn(scan.nextLine());
            book.setYear(new Calendar().getInstance());
            System.out.println("Nome do autor do livro:");
            book.setAuthor(scan.nextLine());

            battery.push(book);
        }

        System.out.println(battery.peek());

        System.out.println(battery.pop());

        System.out.println(battery.isEmpty());

        battery.remove(0);

    }
}
