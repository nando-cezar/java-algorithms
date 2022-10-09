package business;

public class CheckingAccount extends Account{

    public CheckingAccount(String number, double balance){
        super(number, balance);
    }

    @Override
    public void updateBalance() {
        double value = this.getBalance() - 1;
        this.setBalance(value);
        System.out.println("Taxa de conta corrente debitada!");        
    }
    
}
