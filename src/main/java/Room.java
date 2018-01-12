import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public int guestCount() {
        return this.guests.size();
    }


}
