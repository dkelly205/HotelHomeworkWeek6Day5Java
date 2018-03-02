import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    DiningRoom diningRoom2;
    Guest guest1;

    @Before
    public void setUp() throws Exception {
        diningRoom = new DiningRoom("Steakhouse", 1, 50);
        diningRoom2 = new DiningRoom("Italian", 2, 2);
        guest1 = new Guest("Danny");
    }

    @Test
    public void testRoomNumber() {
        assertEquals(1, diningRoom.getRoomNumber());
    }

    @Test
    public void testCapacity() {
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void testNumberOfGuestsStartsEmpty(){
        assertEquals(0, diningRoom.getNumberOfGuests());
    }

    @Test
    public void testCanAddGuestToRoom(){
        diningRoom.addGuest(guest1);
        assertEquals(1, diningRoom.getNumberOfGuests());
    }

    @Test
    public void testCannotAddGuestToRoomIfCapacityReached(){
        diningRoom2.addGuest(guest1);
        diningRoom2.addGuest(guest1);
        diningRoom2.addGuest(guest1);
        assertEquals(2, diningRoom2.getNumberOfGuests());
    }
}
