import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;



    @Before
    public void setUp() throws Exception {
        conferenceRoom = new ConferenceRoom(2, 15, 100.00);
    }

    @Test
    public void testConferenceRoomNumber(){
        assertEquals(2, conferenceRoom.getRoomNumber());
    }

    @Test
    public void testConferenceCapacity() {
        assertEquals(15, conferenceRoom.getCapacity());
    }

    @Test
    public void testConferenceCost() {
        assertEquals(100.00, conferenceRoom.getCost(), 0.01);
    }
}
