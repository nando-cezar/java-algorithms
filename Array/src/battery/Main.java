package battery;

public class Main {
    
    public static void main(String[] args){

        Battery<Integer> b = new Battery<Integer>();

        for(int i=1; i <= 10; i++){
            b.stackUp(i);
        }
        System.out.println(b);
        System.out.println(b.getSize());
    }
}
