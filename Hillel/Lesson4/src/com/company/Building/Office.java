package com.company.Building;

public class Office extends Building {

    private boolean parking;
    private int parkingQnt;

    public Office(String type, int frontDoorQnt, int florQnt, String street, int apartmentFloorQnt, boolean attic, boolean basement, boolean parking, int parkingQnt) {
        super(type, frontDoorQnt, florQnt, street, apartmentFloorQnt, attic, basement);
        this.parking = parking;
        this.parkingQnt = parkingQnt;
    }

    @Override
    public String toString() {
        return "Office{" +"\n" +
                "parking=" + parking +"\n" +
                ", parkingQnt=" + parkingQnt +"\n" +
                '}';
    }
}
