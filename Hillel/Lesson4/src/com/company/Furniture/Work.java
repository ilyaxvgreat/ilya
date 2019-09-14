package com.company.Furniture;

public class Work extends Furniture {
    private String material;

    public Work(int id, String title, String colour, String material) {
        super(id, title, colour);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Work{" +
                "material='" + material + '\'' +
                '}';
    }
}
