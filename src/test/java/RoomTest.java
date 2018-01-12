import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before() {
        room = new Room(5);
        guest = new Guest("Richard", 2);
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, room.getCapacity());
    }

    @Test
    public void canAddGuest() {
        assertEquals(0, room.guestCount());
        room.addGuest(guest);
        assertEquals(1, room.guestCount());
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
        assertEquals(1, room.guestCount());
    }

}
