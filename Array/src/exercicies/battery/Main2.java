package exercicies.battery;

import java.util.Scanner;

import battery.Battery;

public class Main2 {
    
    public static void main(String[] args){

        Battery<Integer> par = new Battery<Integer>();

        Battery<Integer> impar = new Battery<Integer>();
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<=10; i++){

            System.out.println("Entre com valores: ");

            int num = scan.nextInt();

            if(num != 0){

                if(num % 2 == 0){

                    par.stackUp(num);
                    System.out.println("Empilhando número par: " + num);
    
                } else {
    
                    impar.stackUp(num);
                    System.out.println("Empilhando número impar: " + num);
                }

            } else if(num == 0){

                Integer stackdownPar = par.stackDown();

                Integer stackdownImpar = impar.stackDown();

                if(stackdownPar == null || stackdownImpar == null){
                    System.out.println("Pilhas vazias!");
                } else {
                    System.out.println("Desempilhando um elemento de cada pilha: " + stackdownPar + " | " + stackdownImpar);
                } 
            }
            
        }

        System.out.println("Desempilhando...");

        while(!par.isEmpty()){

            System.out.println("Desempilhando um elemento da pilha: " + par.stackDown());
        }

        while(!impar.isEmpty()){

            System.out.println("Desempilhando um elemento da pilha: " + impar.stackDown());
        }

        System.out.println("Todos os elementos foram desempilhando!");

    }
}
