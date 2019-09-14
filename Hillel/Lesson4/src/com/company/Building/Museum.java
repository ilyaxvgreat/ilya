package com.company.Building;

public class Museum extends Building {

    private int openingYear;

    public Museum(String type, int frontDoorQnt, int florQnt, String street, int apartmentFloorQnt, boolean attic, boolean basement, int openingYear) {
        super(type, frontDoorQnt, florQnt, street, apartmentFloorQnt, attic, basement);
        this.openingYear = openingYear;
    }

    @Override
    public String toString() {
        return "Museum{" + "\n" +
                "type=" + getType() + "\n" +
                "street=" + getStreet() + "\n" +
                "openingYear=" + openingYear + "\n" +
                '}';
    }


}
