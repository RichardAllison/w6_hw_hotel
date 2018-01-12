public class ConferenceRoom extends Room {

    String roomName;
    double charge;

    public ConferenceRoom(int capacity, String roomName, double charge) {
        super(capacity);
        this.roomName = roomName;
        this.charge = charge;
    }
}
