package Lab_3.Problem4;

import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, java.util.Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    @Override
    public int compareTo(Employee other) {
        if (this.salary == other.salary && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return super.compareTo(other);
    }

    @Override
    public String toString() {
        return super.toString() + " | bonus: " + bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Manager)) return false;

        Manager m = (Manager) o;
        return this.bonus == m.bonus;
    }

    @Override
    public Manager clone() {
        Manager cloned = new Manager(name, salary, (java.util.Date) hireDate.clone(), insuranceNumber, bonus);
        
        // DEEP CLONE team
        for (Employee e : team) {
            cloned.addEmployee(e.clone());
        }

        return cloned;
    }
}