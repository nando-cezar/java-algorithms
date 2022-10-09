package ui;

import business.Account;
import business.Bank;
import business.CheckingAccount;
import business.Client;
import business.SavingsAccount;

public class Main {
    
    public static void main(String[] args){

        Bank bank = new Bank();
		Account account=new SavingsAccount("1234", 100);
		Client c1 = new Client("Manoel", account);
		bank.addClient(c1);
		
		bank.addClient(new Client("Maria", new SavingsAccount("456", 200)));
		bank.addClient(new Client("Joao", new SavingsAccount("8910", 300)));
		bank.addClient(new Client("Ze", new CheckingAccount("1122", 500)));
		
		bank.searchPerNumber("456").deposit(20);
		System.out.println(bank.getBalance());
    }
}
