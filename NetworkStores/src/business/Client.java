package business;

public class Client {
    
    private String accountNumber;
    private double balance;
    private double totalCharged;
    private double totalPayments;
    private double creditLimit;
    private double newBalance;

    public Client(String accountNumber, double balance, double totalCharged, double totalPayments, double creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.totalCharged = totalCharged;
        this.totalPayments = totalPayments;
        this.creditLimit = creditLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalCharged() {
        return totalCharged;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getNewBalance() {
        newBalance = this.getBalance() + this.getTotalCharged() - this.getTotalPayments();
        return newBalance;
    }

    @Override
    public String toString() {
        return "Client [accountNumber=" + accountNumber + ", newBalance=" + getNewBalance() + "]";
    }

}
