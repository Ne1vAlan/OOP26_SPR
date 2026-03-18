package Practice_4.Problem4.Interfaces.model;

public class Student implements Comparable<Student> {
    public String name;
     public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return name + " " + gpa;
    }
}