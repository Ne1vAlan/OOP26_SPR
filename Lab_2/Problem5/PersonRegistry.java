package Lab_2.Problem5;

import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public String toString() {
        String result = "";

        for (Person p : people) {
            result += p + "\n";
        }

        return result;
    }
}
