package com.company;

public class Main {

    public static void main(String[] args) {

        StudentFactory studentFactory = new StudentFactory();

        Student[] arrayStudent = new Student[8];
        for (int i = 0; i < arrayStudent.length; i++) {
            arrayStudent[i] = studentFactory.createNewStudent();
        }

        arrayStudent[0] = new Student(48, 23, "Dima");
        arrayStudent[1] = new Student(53, 22, "Ivan");

        Sorting sorting = new Sorting();
        sorting.sortName(arrayStudent);

        sorting.sortAge(arrayStudent);

        Searching searching = new Searching();

        searching.nameSearch(arrayStudent,"Dima");

        String[] namesSearch = {"Dima","Ivan"};
        searching.namesSearch(arrayStudent,namesSearch);
    }
}

