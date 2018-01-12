import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 30, BedroomType.DOUBLE);
        bedrooms = new ArrayList<>(Arrays.asList(bedroom));
        conferenceRoom1 = new ConferenceRoom(10, "Conference Room", 50);
        conferenceRoom2 = new ConferenceRoom(5, "Small Room", 20);
        conferenceRooms = new ArrayList<>(Arrays.asList(conferenceRoom1, conferenceRoom2));
        diningRoom = new DiningRoom(10, "Dining Room");
        diningRooms = new ArrayList<>(Arrays.asList(diningRoom));
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
        guest = new Guest("Richard", 2);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(2, hotel.countConferenceRooms());
    }

    @Test
    public void hasDiningRooms() {
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void canCheckInGuests() {
        hotel.checkInGuest(guest);
        assertEquals(1, hotel.countGuests());
    }

    @Test
    public void canCheckOutGuests() {
        hotel.checkInGuest(guest);
        assertEquals(1, hotel.countGuests());
        hotel.checkOutGuest(guest);
        assertEquals(0, hotel.countGuests());
    }
}
