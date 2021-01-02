

package exercicies.battery;

import java.util.Stack;

public class Main8 {


    public static void main(String[] args){
        
        Stack<Integer> original = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>(); 
        
        original.push(3);
        original.push(2);
        original.push(1);
    }

    public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux){
        if(n > 0){
            torreDeHanoi(n-1, original, aux, dest);
        }
    }
    
}
