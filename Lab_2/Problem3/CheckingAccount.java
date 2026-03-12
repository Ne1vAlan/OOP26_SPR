package Lab_2.Problem3;

public class CheckingAccount extends Account{
	private int transactionCount;
	public static final int FREE_TRANSACTION = 5;
	public static final double FEE = 0.02;
	
	public CheckingAccount(int accNumber) {
		super(accNumber);
		transactionCount = 0;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		transactionCount++;
	}
	public void withdraw(double sum) {
		super.withdraw(sum);
		transactionCount++;
	}
	
	public void deductFee() {
		if(transactionCount > FEE) {
			double fee = (transactionCount - FREE_TRANSACTION) * FEE;
			super.withdraw(fee);
		}
		transactionCount = 0;
	}
	
	public void update() {
        deductFee();
    }
	
}
