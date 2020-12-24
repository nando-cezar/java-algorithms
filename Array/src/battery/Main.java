package battery;

public class Main {
    
    public static void main(String[] args){

        Battery<Integer> b = new Battery<Integer>();

        System.out.println(b);
        System.out.println(b.getSize());
    }
}
