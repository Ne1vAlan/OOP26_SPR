package Practice_4.Problem4.Interfaces.main;

import java.util.*;
import Practice_4.Problem4.Interfaces.model.Student;
import Practice_4.Problem4.Interfaces.services.NameComparator;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Alan", 3.5));
        list.add(new Student("Katia", 3.9));
        list.add(new Student("Sofia", 3.2));

        Collections.sort(list);
        System.out.println("Sort by GPA: " + list);

        Collections.sort(list, new NameComparator());
        System.out.println("Sort by Name: " + list);
    }
}