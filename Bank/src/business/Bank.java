package business;

public class Bank {
    
    private Client[] list;

    public Bank() {
        this.list = new Client[4];
    }

    public void addClient(Client client) {
        for(int i = 0; i < list.length; i++){
            if(this.list[i] == null){
                this.list[i] = client;
                i = 5;
            }
        }
    }

    public Account searchPerNumber(String number) {
        for(int i = 0; i < list.length; i++){
            String n = this.list[i].getAccount().getNumber();
            if(number.equalsIgnoreCase(n)){
                return this.list[i].getAccount();
            }
        }
        return null;
    }

    public Account searchPerName(String name){
        for(int i = 0; i < list.length; i++){
            String value = this.list[i].getName();
            if(name.equalsIgnoreCase(value)){
                return this.list[i].getAccount();
            }
        }
        return null;
    }

    public double getBalance(){
        double value = 0;
        for(int i = 0; i < list.length; i++){
            value += this.list[i].getAccount().getBalance();
        }
        return value;
    }
}
