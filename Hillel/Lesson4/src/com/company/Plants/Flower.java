package com.company.Plants;

public class Flower extends Plants {
    private int lifeDay;
    private String breeding;

    public Flower(String plantTitle, boolean bark, boolean fruit, boolean blossom, int lifeDay, String breeding) {
        super(plantTitle, bark, fruit, blossom);
        this.lifeDay = lifeDay;
        this.breeding = breeding;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "lifeDay=" + lifeDay +
                ", breeding='" + breeding + '\'' +
                '}';
    }
}
