package Practice3.University;

public class Room {

    @Override
    public String toString() {
        return ""+ roomNumber ;
    }

    private int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

}
