package Practice_4.Interfaces.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {

    public Student(String name) {
        super(name);
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza");
    }

    @Override
    public void retakeExam() {
        System.out.println(name + " is retaking exam");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }

    @Override
    public void dance() {
        System.out.println(name + " is dancing");
    }
}