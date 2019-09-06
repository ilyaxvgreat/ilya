package com.company;

public class Searching {

    public String nameSearch(Student[] arrayStudent, String nameSearch) {
        for (int i = 0; i < arrayStudent.length; i++) {
            if (arrayStudent[i].getName().contains(nameSearch)) {
                return "Contains";
            }
        }
        return null;
    }

    public String[] namesSearch(Student[] arrayStudent, String[] nameSearch) {
    String[] namesSearchResult = new String[nameSearch.length];
        for (int i = 0; i < arrayStudent.length; i++) {
            for (int j = 0; j < nameSearch.length; j++) {
                if (arrayStudent[i].equals(nameSearch[j])) {
                    namesSearchResult[j] = String.valueOf(arrayStudent[i]);
                }
            }
        }
        return namesSearchResult;
    }
}
