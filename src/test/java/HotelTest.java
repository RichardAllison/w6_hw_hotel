import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    DiningRoom diningRoom;
    ArrayList<Room> rooms;
    Guest guest;
    Guest guest2;

    @Before
    public void before() {
        bedroom = new Bedroom(1, BedroomType.DOUBLE);
        bedroom2 = new Bedroom(2, BedroomType.SINGLE);
        bedroom3 = new Bedroom(330, BedroomType.DOUBLE);
        conferenceRoom1 = new ConferenceRoom(10, "Conference Room", 50);
        conferenceRoom2 = new ConferenceRoom(5, "Small Room", 20);
        diningRoom = new DiningRoom(10, "Dining Room");
        rooms = new ArrayList<>(Arrays.asList(bedroom, bedroom2, bedroom3, conferenceRoom1, conferenceRoom2, diningRoom));
        hotel = new Hotel(rooms);
        guest = new Guest("John");
        guest2 = new Guest("Elizabeth");
    }

    @Test
    public void hasRooms() {
        assertEquals(4, hotel.countRooms());
    }

    @Test
    public void canCheckInGuestToRoom() {
        assertTrue(hotel.checkRoomEmpty(bedroom));
        hotel.checkInGuest(bedroom, guest);
        hotel.checkInGuest(bedroom, guest2);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void canCheckOutGuests() {
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, bedroom.countGuests());
        hotel.checkOutGuest(bedroom, guest);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canCheckRoomForGuests() {
        hotel.checkInGuest(bedroom, guest);
        hotel.checkInGuest(bedroom, guest2);
        assertFalse(hotel.checkRoomEmpty(bedroom));
        assertEquals(guest, hotel.findGuestsInRoom(bedroom).get(0));
        assertEquals(guest2, hotel.findGuestsInRoom(bedroom).get(1));
    }

    @Test
    public void canFindEmptyRooms() {
        hotel.checkInGuest(bedroom3, guest);
        assertEquals(bedroom, hotel.findEmptyRooms().get(0));
        assertEquals(bedroom2, hotel.findEmptyRooms().get(1));
        assertEquals(conferenceRoom1, hotel.findEmptyRooms().get(2));
    }

}
