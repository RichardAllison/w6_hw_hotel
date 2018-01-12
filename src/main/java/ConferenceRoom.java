public class ConferenceRoom extends Room {

    int roomNumber;
    double charge;

    public ConferenceRoom(int capacity, int roomNumber, double charge) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.charge = charge;
    }
}
