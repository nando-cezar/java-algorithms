package exercicies.battery;

import java.util.Calendar;
import java.util.Scanner;

import battery.Battery;
import exercicies.beans.Book;

public class Main3 {
    
    public static void main(String[] args){

        Book book = new Book();

        Battery<Book> battery = new Battery<Book>(20);

        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<=6; i++){
            
            System.out.println("Enserir livro");
            System.out.println();
            System.out.println("Nome do livro:");
            book.setName(scan.nextLine());
            System.out.println("Isbn do livro");
            book.setIsbn(scan.nextLine());
            System.out.println("Nome do autor do livro:");
            book.setAuthor(scan.nextLine());

            battery.stackUp(book);
        }

        System.out.println(battery.top());

        System.out.println(battery.stackDown());

        System.out.println(battery.isEmpty());

        battery.remove(0);

    }
}
