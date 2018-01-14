import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before() {
        room = new Room(5);
        guest = new Guest("Richard");
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, room.getCapacity());
    }

    @Test
    public void canAddGuest() {
        assertEquals(0, room.countGuests());
        room.addGuest(guest);
        assertEquals(1, room.countGuests());
    }

    @Test
    public void hasGuests() {
        assertEquals(0, room.countGuests());
        room.addGuest(guest);
        assertEquals(guest, room.getGuests().get(0));
    }

    @Test
    public void testCapacityMet() {
        room = new Room(1);
        room.addGuest(guest);
        assertTrue(room.capacityMet());
    }

    @Test
    public void cannotAddMoreThanCapacity() {
        room = new Room(1);
        room.addGuest(guest);
        room.addGuest(guest);
        assertEquals(1, room.countGuests());
    }

}
