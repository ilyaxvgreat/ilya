package com.company.Building;

public class Residential extends Building {
    private boolean playground;

    public Residential(String type, int frontDoorQnt, int florQnt, String street, int apartmentFloorQnt, boolean attic, boolean basement, boolean playground) {
        super(type, frontDoorQnt, florQnt, street, apartmentFloorQnt, attic, basement);
        this.playground = playground;
    }

    @Override
    public String toString() {
        return "Residential{" +"\n" +
                "playground=" + playground +"\n" +
                '}';
    }
}
