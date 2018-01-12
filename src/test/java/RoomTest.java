import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before() {
        room = new Room(5);
        guest = new Guest();
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

}
