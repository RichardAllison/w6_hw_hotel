public class ConferenceRoom extends BookableRoom {

    String roomName;

    public ConferenceRoom(int capacity, String roomName, double charge) {
        super(capacity, charge);
        this.roomName = roomName;
    }
}
