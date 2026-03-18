package Practice_4.Problem2.Interfaces.model;

public class Cat implements CanHavePizza {
    
    @Override
    public void eatPizza() {
        System.out.println("Cat is eating pizza");
    }
}