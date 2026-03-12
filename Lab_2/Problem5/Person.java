package Lab_2.Problem5;

public abstract class Person {
	protected String name;
	protected int age;
	protected Animal pet;
	protected Animal tempory;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void assignPet(Animal pet) {
		this.pet = pet;
	}
	
	public void removePet() {
		pet = null;
	}
	
	public boolean hasPet() {
		return pet != null;
	}
	
	public void leavePetWith(Person other) {
        if (pet != null) {
            other.assignPet(pet);
            tempory = pet;
            pet = null;
        }
    }

    public void retrievePetFrom(Person other) {
        if (tempory != null) {
            this.pet = tempory;
            other.removePet();
            tempory = null;
        }
    }
    public abstract String getOccupation();
    
    public String toString() {

        String petInfo;

        if (pet == null) {
            petInfo = "No pet";
        } else {
            petInfo = pet.toString();
        }

        return "Name: " + name + "\nAge: " + age 
        		+ "\n" + getOccupation() + "\nPet: " + petInfo;
    }
	
}
