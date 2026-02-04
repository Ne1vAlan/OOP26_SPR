package Practice_2;

import java.util.Scanner;

class Student {
    private String name; // это данные студента которые хранятся внутри объектса
    private int id;
    private int yearOfStudy;

    
    public Student(String studentName, int studentId) {
        name = studentName;
        id = studentId;
        yearOfStudy = 1;
    }

    public String getName() { // эта часть нужна для доступа к private тоесть просмотр значений 
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }
}

public class Pb_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student id: ");
        int id = sc.nextInt();

        Student s = new Student(name, id);

        
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("YEAR: " + s.getYearOfStudy());

        s.incrementYearOfStudy();

        System.out.println("After increment:");
        System.out.println("Year: " + s.getYearOfStudy());

        sc.close();
    }
}
