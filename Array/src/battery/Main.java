package battery;

import java.util.Stack;

public class Main {
    
    public static void main(String[] args){

        Battery<Integer> b = new Battery<Integer>();

        for(int i=1; i <= 10; i++){
            b.stackUp(i);
        }

        System.out.println(b);
        System.out.println(b.getSize());
        System.out.println(b.top());
        System.out.println(b.stackDown());

        ///////////////////////////////////////////////////////////////////////////////////////
        Stack<Integer> s = new Stack<Integer>();

        for(int i=1; i <= 10; i++){
            s.push(i);
        }

        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.pop());
        System.out.println(s.peek());

    }
}
