package com.company;

import java.util.Objects;

public class Human {

    private String name;
    private int age;
    private int mobNumber;

    public Human(String name, int age, int mobNumber) {
        this.name = name;
        this.age = age;
        this.mobNumber = mobNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                mobNumber == human.mobNumber &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mobNumber);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobNumber=" + mobNumber +
                '}';
    }
}
