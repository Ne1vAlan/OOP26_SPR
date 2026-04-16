package Lab_3.Problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return name + " | salary: " + salary + " | hireDate: " + hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee e = (Employee) o;
        return name.equals(e.name) && insuranceNumber.equals(e.insuranceNumber);
    }

    @Override
    public Employee clone() {
        Object o;
        return new Employee(name, salary, (Date) hireDate.clone(), insuranceNumber);
    }
}