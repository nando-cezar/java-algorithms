package exercicies.battery;

import java.util.Stack;

public class Main7 {


    public static void main(String[] args){
        
        imprimeResultado(2);
    }

    public static void imprimeResultado(int numero){
        System.out.println(numero + "em binario é: " + decimalBinario(numero));
    }

    public static String decimalBinario(int numero){

        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while(numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while(!pilha.isEmpty()){
            numBinario += pilha.pop();
        }

        return numBinario;
    }
}
