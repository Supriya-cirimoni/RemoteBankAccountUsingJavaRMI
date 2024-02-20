package client;

//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
import java.rmi.Naming;
import java.util.Scanner;
import common.Account;

public class AccountClient {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			Account a=(Account) Naming.lookup("//localhost:9090/Account");
			System.out.println("Name:"+a.getName());
			System.out.println("Balance:"+a.getBalance());
			do {
				System.out.println("Click 1.Withdraw 2.Deposit: 3.Exit");
				int n=sc.nextInt();
				switch(n) {
				case 1:System.out.println("Enter the amount to withdraw:");
					double input=sc.nextDouble();
					a.withdraw(input);
					System.out.println("Balance after withdraw: "+a.getBalance());
					break;
				case 2:System.out.println("Enter the amount to deposit:");
					double input1=sc.nextDouble();
					a.deposit(input1);
					System.out.println("Balance after deposit: "+a.getBalance());
					break;
				case 3:System.exit(0);
				default:System.out.println("Invalid Input");
			}
			}while(true);
		}
		catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}

}
