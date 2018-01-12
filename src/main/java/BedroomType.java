public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    TRIPLE(3),
    QUAD(4),
    FAMILY(5);

    private final int capacity;

    BedroomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

}


