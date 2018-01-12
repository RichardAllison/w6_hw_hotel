import java.util.ArrayList;

public class Room {

    private int capacity;
    private int roomNumber;
    private double charge;
    private ArrayList<Guest> guests;

    public Room(int capacity, int roomNumber, double charge) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.charge = charge;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getCharge() {
        return charge;
    }
}
