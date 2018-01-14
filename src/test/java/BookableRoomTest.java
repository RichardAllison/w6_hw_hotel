import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookableRoomTest {

    BookableRoom bookableRoom;
    Guest guest;

    @Before
    public void before() {
        bookableRoom = new BookableRoom(1, 10);
        guest = new Guest("Richard");
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bookableRoom.getCapacity());
    }

    @Test
    public void canAddBooking() {
        bookableRoom.addBooking(2);
        assertEquals(2, bookableRoom.getDaysBooked());
    }

    @Test
    public void canAddGuest() {
        assertEquals(0, bookableRoom.countGuests());
        bookableRoom.addBooking(1);
        bookableRoom.addGuest(guest);
        assertEquals(1, bookableRoom.countGuests());
    }

    @Test
    public void hasGuests() {
        assertEquals(0, bookableRoom.countGuests());
        bookableRoom.addBooking(1);
        bookableRoom.addGuest(guest);
        assertEquals(guest, bookableRoom.getGuests().get(0));
    }

    @Test
    public void testCapacityMet() {
        bookableRoom.addBooking(1);
        bookableRoom.addGuest(guest);
        assertTrue(bookableRoom.capacityMet());
    }

    @Test
    public void cannotAddMoreThanCapacity() {
        bookableRoom.addBooking(1);
        bookableRoom.addGuest(guest);
        bookableRoom.addGuest(guest);
        assertEquals(1, bookableRoom.countGuests());
    }

    @Test
    public void getBooking() {
        assertFalse(bookableRoom.checkBooked());
    }

}
