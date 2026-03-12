package Lab_2.Problem3;

public class TestForBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		SavingAccount s1 = new SavingAccount(1, 5);
		CheckingAccount c1 = new CheckingAccount(2);
		
		s1.deposit(1000);
		c1.deposit(500);
		c1.withdraw(50);
		c1.withdraw(30);
		c1.withdraw(10);
		c1.withdraw(30);
		
		bank.openAccount(s1);
		bank.openAccount(c1);
		
		bank.update();	
		
		System.out.println(s1.toString());
	}

}