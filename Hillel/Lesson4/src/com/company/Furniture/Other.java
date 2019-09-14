package com.company.Furniture;

public class Other extends Furniture {
    private String room;

    public Other(int id, String title, String colour, String room) {
        super(id, title, colour);
        this.room = room;
    }

    @Override
    public String toString() {
        return "Other{" +
                "room='" + room + '\'' +
                '}';
    }
}
