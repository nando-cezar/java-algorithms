package exercicies.battery;

import battery.Battery;

public class Main6 {
    
    public static void main(){

    }

    public static String ABRE = "([{";
    public static String FECHA = ")]}";

    public static boolean checkBalancedSymbols(String arg){

        boolean balanced = true;
        Battery<Character> c = new Battery<>();
        char symbol, top;

        for(int i=0; i<arg.length() && balanced; i++){
            symbol = ABRE.charAt(i);

            if(ABRE.indexOf(symbol) > -1){
                c.stackUp(symbol);
            } else if(FECHA.indexOf(symbol) > -1){
                if(c.isEmpty()){
                    return false;
                } else {
                    top = c.stackDown();
                    if(ABRE.charAt(top) != FECHA.charAt(symbol)){
                        return false;
                    }
                }
            }
        }

        return false;
    }
}
