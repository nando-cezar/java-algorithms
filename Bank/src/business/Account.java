package business;

public abstract class Account{

    private String number;
    private double balance;

    protected Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void updateBalance();

    public double deposit(double value) {
        double newValue = this.getBalance() + value;
        this.setBalance(newValue);
        return newValue;
    }

    public double withdrawn(double value) {
        double newValue = this.getBalance() - value;
        this.setBalance(newValue);
        return newValue;
    }
}
