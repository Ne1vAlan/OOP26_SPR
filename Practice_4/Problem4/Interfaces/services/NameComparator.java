package Practice_4.Problem4.Interfaces.services;

import java.util.Comparator;
import Practice_4.Problem4.Interfaces.model.Student;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}