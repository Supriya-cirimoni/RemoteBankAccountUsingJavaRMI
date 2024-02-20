package bank;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

import common.Account;

public class RemoteAccount {

	public static void main(String[] args) {
		try {
			//Registry r1= LocateRegistry.createRegistry(8888);
			//System.setProperty("java.rmi.server.hostname", "127.0.0.1");
			System.out.println("Server Started");
			
			Account account=new AccountImpl("John Raymond",15294.31);
			System.out.println("Account Object Created");
			Naming.rebind("//localhost:9090/Account", account);
			System.out.println("Rebind Done!");
			//Account a1=(Account)UnicastRemoteObject.exportObject(account, 0);
			
			//Registry r1= LocateRegistry.getRegistry("127.0.0.1",9100);
			//r1.bind("stub",a1);
			
		}
		catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}

}
