package exercicies.battery;

import battery.Battery;

public class Main6 {
    
    public static void main(String[] args){

        System.out.println(checkBalancedSymbols("A + B"));
        System.out.println(checkBalancedSymbols("A + B - (D-F)"));
        System.out.println(checkBalancedSymbols("{[()]}[](){()}"));
        System.out.println(checkBalancedSymbols("{[(]}[](){()}"));
        System.out.println(checkBalancedSymbols("A + B - D-F)"));
    }

    public static String ABRE = "([{";
    public static String FECHA = ")]}";

    public static boolean checkBalancedSymbols(String arg){

        Battery<Character> c = new Battery<Character>();
        char symbol, top;

        for(int i=0; i<arg.length(); i++){
            symbol = arg.charAt(i);

            if(ABRE.indexOf(symbol) > -1){
                c.stackUp(symbol);
            } else if(FECHA.indexOf(symbol) > -1){
                if(c.isEmpty()){
                    return false;
                } else {
                    top = c.stackDown();
                    if(ABRE.indexOf(top) != FECHA.indexOf(symbol)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
