package com.company.Furniture;

public class Furniture {
    private int id;
    private String title;
    private String colour;

    public Furniture(int id, String title, String colour) {
        this.id = id;
        this.title = title;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
