package Lab_2.Problem3;

import java.util.Vector;

public class Bank {
	private Vector<Account> accounts;
	
	public Bank() {
		accounts = new Vector<>();
	}
	
	public void update() {
		for(Account acc : accounts) {
            acc.update();
        }
	}
	
	public void openAccount(Account acc) {
		accounts.add(acc);
	}
	
	public void closeAccount(Account acc) {
		accounts.remove(acc);
	}
}
