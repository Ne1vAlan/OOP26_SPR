package Lab_2.Problem5;

public class TestForPet {

    public static void main(String[] args) {

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");

        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println(registry);

        john.leavePetWith(alice);

        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println(registry);
    }
}