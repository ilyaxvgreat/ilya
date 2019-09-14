package com.company.Building;

public class Building {
    private String type;
    private int frontDoorQnt;
    private int florQnt;
    private String street;
    private int apartmentFloorQnt;
    private boolean attic;
    private boolean basement;

    public Building(String type, int frontDoorQnt, int florQnt, String street, int apartmentFloorQnt, boolean attic, boolean basement) {
        this.type = type;
        this.frontDoorQnt = frontDoorQnt;
        this.florQnt = florQnt;
        this.street = street;
        this.apartmentFloorQnt = apartmentFloorQnt;
        this.attic = attic;
        this.basement = basement;
    }

    public String generalApartmentQnt() {
        return "General apartment quantity is: " + this.frontDoorQnt * this.florQnt * this.apartmentFloorQnt;
    }

    @Override
    public String toString() {
        return "Building{" +"\n" +
                "type='" + type + "\n" +
                ", frontDoorQnt=" + frontDoorQnt +"\n" +
                ", florQnt=" + florQnt +"\n" +
                ", street='" + street + "\n" +
                ", apartmentFloorQnt=" + apartmentFloorQnt +"\n" +
                ", attic=" + attic +"\n" +
                ", basement=" + basement +"\n" +
                '}';
    }

    public String getType() {
        return type;
    }

    public int getFrontDoorQnt() {
        return frontDoorQnt;
    }

    public int getFlorQnt() {
        return florQnt;
    }

    public String getStreet() {
        return street;
    }

    public int getApartmentFloorQnt() {
        return apartmentFloorQnt;
    }

    public boolean isAttic() {
        return attic;
    }

    public boolean isBasement() {
        return basement;
    }
}
