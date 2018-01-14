public class BookableRoom extends Room {

    private boolean booked;
    private int daysBooked;
    double charge;

    public BookableRoom(int capacity, double charge) {
        super(capacity);
        this.daysBooked = 0;
        this.booked = false;
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
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

    public double guestBill() {
        return getDaysBooked() * getCharge() * countGuests();
    }

}
