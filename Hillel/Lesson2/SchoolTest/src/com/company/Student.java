package com.company;

class Student {

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private int id;
    private int age;
    private String name;

    Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
