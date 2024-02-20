package bank;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.Account;
import common.Money;

public class AccountImpl extends UnicastRemoteObject implements Account{
	
	private String name;
    private Money balance;
    
    public AccountImpl() throws RemoteException{
    	this.balance=new Money(0);
    	this.name=null;
    }

    public AccountImpl(String name, double balance) throws RemoteException{
        this.name = name;
        this.balance=new Money(balance);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getBalance() {
        return balance.getAmount();
    }

    @Override
    public void setBalance(double balance) {
        this.balance.setAmount(balance);
    }

    @Override
    public void withdraw(double amount) {
        balance.setAmount(balance.getAmount()-amount);
    }

    @Override
    public void deposit(double amount) {
    	balance.setAmount(balance.getAmount()+amount);
    }

}
