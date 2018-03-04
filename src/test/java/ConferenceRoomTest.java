import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    ConferenceRoom conferenceRoom2;
    Guest guest1;



    @Before
    public void setUp() throws Exception {
        conferenceRoom = new ConferenceRoom(2, 15, 100.00);
        conferenceRoom2 = new ConferenceRoom(3, 2, 100.00);
        guest1 = new Guest("Danny");
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

    @Test
    public void testNumberOfGuestsStartsEmpty(){
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void testCanAddGuestToRoom(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void testCannotAddGuestToRoomIfCapacityReached(){
        conferenceRoom2.addGuest(guest1);
        conferenceRoom2.addGuest(guest1);
        conferenceRoom2.addGuest(guest1);
        assertEquals(2, conferenceRoom2.getNumberOfGuests());
    }


}
