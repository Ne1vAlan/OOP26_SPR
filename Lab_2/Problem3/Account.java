package Lab_2.Problem3;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0.0;
		accNumber = 0;
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	public void withdraw(double sum) {
		if(balance >= sum) {
			balance -= sum; 
		}
	}
	public double getBalance() {
		return balance;
	}
	public double getAccountNumber() {
		return accNumber;
	}
	public void transfer(double amount, Account other) {
		if(balance >= amount) {
			withdraw(amount);
			other.deposit(amount);
		}
	}
	
	public void update() {
    }
	
	public String toString() {
		return "Account: " + accNumber +
				"\nBalance: " + balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
	
	
}
