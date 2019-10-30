package lesson12;

public class Student {
    private String name;
    private int age;

    static void deserialize(String s) throws MyException {
        throw new MyException();
    }

    public void setName(String name) {
        if (name.length() == 0 || name == null) {
            throw new IllegalArgumentException("введи имя");
        }
        this.name = name;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("ты ввел 0");
        }
        this.age = age;
    }
}
