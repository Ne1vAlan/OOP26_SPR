package Lab_3.Problem6;

import Lab_2.Problem5.Employee;

public class EmployeeEx extends Employee implements Payable, Cloneable {

    public EmployeeEx(String name, int age) {
        super(name, age, name);
    }

    @Override
    public double getPayment() {
        return 1000; 
    }

    @Override
    public EmployeeEx clone() {
        return new EmployeeEx(this.name, this.age);
    }
}