public class Bedroom extends BookableRoom {

    private BedroomType type;
    int roomNumber;


    public Bedroom(int roomNumber, BedroomType type) {
        super(type.getCapacity(), type.getCharge());
        this.type = type;
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {
        return type.getCapacity();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}
