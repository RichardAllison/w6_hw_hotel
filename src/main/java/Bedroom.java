public class Bedroom extends Room {

    private BedroomType type;
    int roomNumber;
    double charge;

    public Bedroom(int roomNumber, double charge, BedroomType type) {
        super(type.getCapacity());
        this.roomNumber = roomNumber;
        this.charge = charge;
        this.type = type;
    }

    public int getRoomCapacity() {
        return type.getCapacity();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getCharge() {
        return charge;
    }
}
