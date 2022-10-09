package business;

public class SavingsAccount extends Account {

    public SavingsAccount(String number, double balance) {
		super(number, balance);
	}
	@Override
	public double withdrawn(double value) {
		double newValue = this.getBalance()-value;
		if(newValue >= 0) {
			this.setBalance(newValue);
			return newValue;
		}
		return -1;
	}

    @Override
    public void updateBalance() {
        double value = this.getBalance() * 1.01;
        this.setBalance(value);
        System.out.println("Taxa de conta corrente debitada!");        
    }
    
}
