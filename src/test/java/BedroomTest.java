import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BedroomTest {

    Bedroom bedroom;
    Bedroom singleBedroom;
    Guest guest;


    @Before
    public void before() {
        bedroom = new Bedroom(1, 10, BedroomType.TWIN);
        singleBedroom = new Bedroom(1, 10, BedroomType.SINGLE);
        guest = new Guest("Richard", 2);
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasCharge() {
        assertEquals(10, bedroom.getCharge(), 0.00);
    }

    @Test
    public void testCapacityMet() {
        singleBedroom.addGuest(guest);
        assertTrue(singleBedroom.capacityMet());
    }

    @Test
    public void cannotAddMoreThanCapacity() {
        singleBedroom.addGuest(guest);
        singleBedroom.addGuest(guest);
        assertEquals(1, singleBedroom.guestCount());
    }


}
