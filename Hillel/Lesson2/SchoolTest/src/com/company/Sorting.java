package com.company;

import java.util.Arrays;
import java.util.Comparator;

class Sorting {

    void sortName(Student[] arrayStudent) {
        String swap;
        for (int i = 0; i < arrayStudent.length; i++) {
            for (int j = 0; j < arrayStudent[i].getName().length(); j++) {
                if (arrayStudent[j].getName().length()>arrayStudent[j+1].getName().length()) {
                    swap = arrayStudent[i].getName();
                    arrayStudent[i] = arrayStudent[i];
                    swap = arrayStudent[i].getName();
                }
            }
        }
    }

    void sortAge(Student[] arrayStudent) {
        Arrays.sort(arrayStudent, Comparator.comparing(Student::getAge));
    }
}

