import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before() {
        room = new Room(5, 1, 10);
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, room.getCapacity());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, room.getRoomNumber());
    }

    @Test
    public void hasCharge() {
        assertEquals(10, room.getCharge(), 0.00);
    }

}
