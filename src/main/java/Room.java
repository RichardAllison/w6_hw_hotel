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


    public int countGuests() {
        return this.guests.size();
    }

    public boolean capacityMet() {
        return (this.capacity == this.countGuests());
    }

    public void addGuest(Guest guest) {
        if (!capacityMet()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
}
