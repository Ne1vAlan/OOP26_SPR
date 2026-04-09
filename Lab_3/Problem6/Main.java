package Lab_3.Problem6;

public class Main {
    public static void main(String[] args) {

        EmployeeEx e = new EmployeeEx("Alice", 25);
        System.out.println("Payment: " + e.getPayment());

        PetEx pet = new PetEx("Buddy", 3);
        pet.play();
    }
}