package common;

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Account extends Remote{
	
	// Getter for the name attribute
    public String getName() throws RemoteException;
    
    // Setter for the name attribute
    public void setName(String name) throws RemoteException;
    
    // Getter for the balance attribute
    public double getBalance() throws RemoteException;
    
    // Setter for the balance attribute
    public void setBalance(double balance) throws RemoteException;
    
    // Method to withdraw money from the account
    public void withdraw(double amount) throws RemoteException;
    
    // Method to deposit money into the account
    public void deposit(double amount) throws RemoteException;
}
