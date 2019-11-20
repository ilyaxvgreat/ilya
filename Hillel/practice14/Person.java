package practice14;

public class Person {
    private String name;
    private String lastName;
    private String mob;

    public Person(String name, String lastName, String mob) {
        this.name = name;
        this.lastName = lastName;
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mob='" + mob + '\'' +
                '}';
    }
}
