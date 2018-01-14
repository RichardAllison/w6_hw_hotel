import java.util.ArrayList;

public class Room {

    private int capacity;
    ArrayList<Guest> guests;


    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean checkRoomEmpty() {
        if (getGuests().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean capacityMet() {
        return (this.capacity == this.countGuests());
    }

    public void addGuest(Guest guest) {
        if (!capacityMet()) {
            this.guests.add(guest);
        }
    }

    public int countGuests() {
        return this.guests.size();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

}
