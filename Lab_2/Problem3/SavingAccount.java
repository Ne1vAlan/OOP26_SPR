package Lab_2.Problem3;

public class SavingAccount extends Account{
	private double interest;
	
	public SavingAccount(int accNumber, double interest) {
		super(accNumber);
		this.interest = interest;
	}
	
	public void addInterest() {
		double in = getBalance() * interest / 100;
		deposit(in);
	}
	
	public void update() {
        addInterest();
    }
}

