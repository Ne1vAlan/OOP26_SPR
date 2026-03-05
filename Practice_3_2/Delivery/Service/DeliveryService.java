package Practice_3_2.Delivery.Service;


import java.util.Objects;

class Person {

    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);

    }
}