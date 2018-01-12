import java.util.ArrayList;

public class DiningRoom extends Room {

    String roomName;
    ArrayList<Guest> guests;

    public DiningRoom(int capacity, String roomName) {
        super(capacity);
        guests = new ArrayList<>();
        this.roomName = roomName;
    }
}
