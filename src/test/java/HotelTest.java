import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Room> rooms;
//    ArrayList<ConferenceRoom> conferenceRooms;
//    ArrayList<DiningRoom> diningRooms;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, BedroomType.DOUBLE);
        bedroom2 = new Bedroom(2, BedroomType.SINGLE);
        bedroom3 = new Bedroom(330, BedroomType.DOUBLE);
        diningRoom = new DiningRoom(10, "Dining Room");
        conferenceRoom1 = new ConferenceRoom(10, "Conference Room", 50);
        conferenceRoom2 = new ConferenceRoom(5, "Small Room", 20);
        rooms = new ArrayList<>(Arrays.asList(bedroom, diningRoom, conferenceRoom1, conferenceRoom2));
//        conferenceRooms = new ArrayList<>(Arrays.asList(conferenceRoom1, conferenceRoom2));
//        diningRooms = new ArrayList<>(Arrays.asList(diningRoom));
        hotel = new Hotel(rooms);
        guest = new Guest("Richard");
    }

    @Test
    public void hasRooms() {
        assertEquals(4, hotel.countRooms());
    }

//    @Test
//    public void hasConferenceRooms() {
//        assertEquals(2, hotel.countConferenceRooms());
//    }
//
//    @Test
//    public void hasDiningRooms() {
//        assertEquals(1, hotel.countDiningRooms());
//    }

//    @Test
//    public void canCheckInGuestToRoom() {
//        hotel.checkInGuest(guest, bedroom);
//        assertEquals(1, hotel.countGuests());
//    }
//
//    @Test
//    public void canCheckOutGuests() {
//        hotel.checkInGuest(guest);
//        assertEquals(1, hotel.countGuests());
//        hotel.checkOutGuest(guest);
//        assertEquals(0, hotel.countGuests());
//    }
}
