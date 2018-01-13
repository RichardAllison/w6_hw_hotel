public class Bedroom extends Room {

    private BedroomType type;
    int roomNumber;
    double charge;

    public Bedroom(int roomNumber, BedroomType type) {
        super(type.getCapacity());
        this.type = type;
        this.roomNumber = roomNumber;
        this.charge = type.getCharge();
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
