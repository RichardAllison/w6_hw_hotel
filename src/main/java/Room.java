import java.util.ArrayList;

public class Room {

    private int capacity;
    ArrayList<Guest> guests;
    private boolean booked;
    private int daysBooked;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.daysBooked = 0;
        this.booked = false;
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

    public boolean checkBooked() {
        return this.booked;
    }

    public void addBooking(int days) {
        if (!checkBooked()) {
            this.booked = true;
            this.daysBooked += days;
        }
    }

    public int getDaysBooked() {
        return daysBooked;
    }

    public void removeBooking() {
        this.booked = false;
        this.daysBooked = 0;
    }

    public void addGuest(Guest guest) {
        if (daysBooked > 0) {
            if (!capacityMet()) {
                this.guests.add(guest);
            }
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
