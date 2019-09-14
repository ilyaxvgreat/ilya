package com.company.Plants;

public class Tree extends Plants {

    private String applicationArea;
    private int hightMax;

    public Tree(String plantTitle, boolean bark, boolean fruit, boolean blossom, String applicationArea, int hightMax) {
        super(plantTitle, bark, fruit, blossom);
        this.applicationArea = applicationArea;
        this.hightMax = hightMax;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "applicationArea='" + applicationArea + '\'' +
                ", hightMax=" + hightMax +
                '}';
    }
}
