package com.company.Plants;

public class Grass extends Plants {
    private boolean allergyFactor;
    private boolean peopleDangerFactor;
    private String applicationArea;

    public Grass(String plantTitle, boolean bark, boolean fruit, boolean blossom, boolean allergyFactor, boolean peopleDangerFactor, String applicationArea) {
        super(plantTitle, bark, fruit, blossom);
        this.allergyFactor = allergyFactor;
        this.peopleDangerFactor = peopleDangerFactor;
        this.applicationArea = applicationArea;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "allergyFactor=" + allergyFactor +
                ", peopleDangeourFactor=" + peopleDangerFactor +
                ", applicationArea='" + applicationArea + '\'' +
                '}';
    }
}
