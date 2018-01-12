import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 10, BedroomType.TWIN);
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


}
