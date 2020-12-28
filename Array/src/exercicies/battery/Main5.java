package exercicies.battery;

import battery.Battery;

public class Main5 {
    
    public static void main(String[] args){

        System.out.println(testPalindromo("ANA"));
        System.out.println(testPalindromo("ANAW"));
    }

    public static boolean testPalindromo(String arg){

        Battery<Character> c = new Battery<Character>();
        String inverse_arg = "";

        for(int i=0; i<arg.length(); i++){

            c.stackUp(arg.charAt(i));

        }

        while(!c.isEmpty()){
            inverse_arg += c.stackDown(); 
        }

        if(inverse_arg.equals(arg)){
            return true;
        }

        return false;
    }

}
