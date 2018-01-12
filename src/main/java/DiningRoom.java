import java.util.ArrayList;

public class DiningRoom extends Room {

    int roomNumber;
    double charge;
    ArrayList<Guest> guests;

    public DiningRoom(int capacity, int roomNumber, double charge) {
        super(capacity);
        guests = new ArrayList<>();
        this.roomNumber = roomNumber;
        this.charge = charge;
    }
}
