import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(5, "Conference Room", 50);
        guest = new Guest("Richard");
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        assertEquals(0, conferenceRoom.guestCount());
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void testCapacityMet() {
        conferenceRoom = new ConferenceRoom(1, "Ridiculously Small Conference Room", 10);
        conferenceRoom.addGuest(guest);
        assertTrue(conferenceRoom.capacityMet());
    }

    @Test
    public void cannotAddMoreThanCapacity() {
        conferenceRoom = new ConferenceRoom(1, "Ridiculously Small Conference Room", 10);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }
}
