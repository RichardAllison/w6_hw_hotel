public class DiningRoom extends Room {

    String roomName;

    public DiningRoom(int capacity, String roomName) {
        super(capacity);
        this.roomName = roomName;
    }

    public void addGuest(Guest guest) {
        if (!capacityMet()) {
            super.guests.add(guest);
        }
    }
}
