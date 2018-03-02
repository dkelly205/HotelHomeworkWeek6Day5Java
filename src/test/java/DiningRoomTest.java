import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void setUp() throws Exception {
        diningRoom = new DiningRoom("Steakhouse", 1, 50);
    }

    @Test
    public void testRoomNumber() {
        assertEquals(1, diningRoom.getRoomNumber());
    }

    @Test
    public void testCapacity() {
        assertEquals(50, diningRoom.getCapacity());
    }
}
