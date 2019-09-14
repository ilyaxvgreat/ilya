package com.company.Furniture;

public class Relax extends Furniture {
    private int relaxLvl;

    public Relax(int id, String title, String colour, int relaxLvl) {
        super(id, title, colour);
        this.relaxLvl = relaxLvl;
    }

    @Override
    public String toString() {
        return "Relax{" +
                "relaxLvl=" + relaxLvl +
                '}';
    }
}
