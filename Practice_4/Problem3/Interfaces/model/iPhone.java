package Practice_4.Problem3.Interfaces.model;

public class iPhone implements SellableAndPluggable {

    public void sell() {
        System.out.println("iPhone sold");
    }

    public void plugIn() {
        System.out.println("iPhone charging");
    }
}