package Lab_3.Problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 5000, new Date(), "123");
        Employee e2 = new Employee("Bob", 6000, new Date(), "456");

        Manager m1 = new Manager("John", 6000, new Date(), "789", 1000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println(e1.compareTo(e2));

        Manager m2 = m1.clone();
        System.out.println(m2);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by name: " + list);

        Collections.sort(list, new HireDateComparator());
        System.out.println("Sorted by date: " + list);
    }
}