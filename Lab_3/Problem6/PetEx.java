package Lab_3.Problem6;

import Lab_2.Problem5.Animal;

public class PetEx extends Animal implements Playable {

    public PetEx(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }

    @Override
    public String getSound() {
        return "Some sound";
    }
}