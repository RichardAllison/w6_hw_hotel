import java.util.ArrayList;

public class Hotel {

    private ArrayList<Guest> guests;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public void checkInGuest(Guest guest) {
        guests.add(guest);
    }

    public void checkOutGuest(Guest guest) {
        guests.remove(guest);
    }

    public int guestCount() {
        return guests.size();
    }

    public int countBedrooms() {
        return bedrooms.size();
    }

    public int countConferenceRooms() {
        return conferenceRooms.size();
    }

    public int countDiningRooms() {
        return diningRooms.size();
    }
}
