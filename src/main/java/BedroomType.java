public enum BedroomType {
    SINGLE(1, 10),
    DOUBLE(2, 20),
    TWIN(2, 20),
    TRIPLE(3, 30),
    QUAD(4, 40),
    FAMILY(5, 50);

    private final int capacity;
    private final double charge;

    BedroomType(int capacity, double charge) {
        this.capacity = capacity;
        this.charge = charge;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getCharge() {
        return charge;
    }
}


