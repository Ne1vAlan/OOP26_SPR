package Lab_3.Problem1;

//Inteface example 

interface Movable {
    void move();
}




class Car implements Movable {
    public void move() {
        System.out.println("Car drives on the road");
    }
}

class Bird implements Movable {
    public void move() {
        System.out.println("Bird flies in the sky");
    }
}




//abstract class

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    abstract void makeSound();
}






class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Cat meows");
    }
}