package Lab_1;

import java.util.Scanner;
import java.util.Vector;

enum Gender {
    BOY, GIRL
}

class Person {
    private final Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}

public class Problem_5 {

    private final Vector<Person> kidnappedPeople = new Vector<>();

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        int i = 0;

        while (i < kidnappedPeople.size() - 1) {
            Gender a = kidnappedPeople.get(i).getGender();
            Gender b = kidnappedPeople.get(i + 1).getGender();

            if (a == Gender.BOY && b == Gender.GIRL) {
                kidnappedPeople.remove(i); 
                kidnappedPeople.remove(i);

                if (i > 0) i--; 
            } else {
                i++;
            }
        }

        return kidnappedPeople.size() > 0;
    }

    private String lineAsString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : kidnappedPeople) sb.append(p);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Problem_5 dragon = new Problem_5();

        System.out.print("Enter line (example: BBGG or GBGB): ");
        String s = sc.nextLine().trim().toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'B') dragon.kidnap(new Person(Gender.BOY));
            else if (c == 'G') dragon.kidnap(new Person(Gender.GIRL));
            else {
                System.out.println("Invalid character: " + c + " (use only B or G)");
                return;
            }
        }

        System.out.println("Initial line: " + dragon.lineAsString());

        boolean willEat = dragon.willDragonEatOrNot();

        System.out.println("After magic:  " + dragon.lineAsString());

        if (willEat) System.out.println("Dragon will eat! People left: " + dragon.kidnappedPeople.size());
        else System.out.println("No one left for dragon lunch.");

        sc.close();
    }
}
