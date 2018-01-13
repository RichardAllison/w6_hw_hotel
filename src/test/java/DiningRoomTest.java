import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(5, "Dining Room");
        guest = new Guest("Richard");
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, diningRoom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        assertEquals(0, diningRoom.guestCount());
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void testCapacityMet() {
        diningRoom = new DiningRoom(1, "Ridiculously Small Dining Room");
        diningRoom.addGuest(guest);
        assertTrue(diningRoom.capacityMet());
    }

    @Test
    public void cannotAddMoreThanCapacity() {
        diningRoom = new DiningRoom(1, "Ridiculously Small Dining Room");
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }
}
