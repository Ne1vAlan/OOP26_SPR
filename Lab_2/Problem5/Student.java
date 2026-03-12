package Lab_2.Problem5;

public class Student extends Person{
	private String major;
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public String getOccupation() {
		return "Student of " + major;
	}

}
