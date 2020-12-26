package exercicies.battery;

import java.util.Scanner;
import java.util.Stack;

import battery.Battery;

public class Main {
    
    public static void main(String[] args){

        Battery<Integer> b = new Battery<Integer>();
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<=10; i++){

            System.out.println("Entre com valores: ");

            int num = scan.nextInt();

            if(num % 2 == 0){

                b.stackUp(num);
                System.out.println("Empilhando número: " + num);

            } else {

                Integer stackdown = b.stackDown();

                if(stackdown == null){
                    System.out.println("Pilha vazia!");
                } else {
                    System.out.println("Número impar, desempilhando um elemento da pilha: " + stackdown);
                }
            }
        }

        System.out.println("Desempilhando...");

        while(!b.isEmpty()){

            System.out.println("Desempilhando um elemento da pilha: " + b.stackDown());
        }

        System.out.println("Todos os elementos foram desempilhando!");

    }
}
