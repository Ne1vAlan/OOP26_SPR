package Practice_1;

public class Pb_5 {
    public static void main(String[] args) {
        
        double balance = 12000;
        
        double interestRate = 0.05;

        double NewBalance = balance + (balance * interestRate);

        System.out.println("Initial balance: " + balance);
        System.out.println("New balance: " + NewBalance); 
    }
}
