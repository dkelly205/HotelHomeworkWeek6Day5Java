import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Guest guest;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        hotel = new Hotel("The Hilton");
        bedroom1 = new Bedroom(201, 2, Type.DOUBLE, 30.00);
        guest = new Guest("Danny");
        guest2 = new Guest("Tina");
    }

    @Test
    public void testGetName(){
        assertEquals("The Hilton", hotel.getName());
    }

    @Test
    public void testCheckIn(){
        hotel.checkIn(guest, bedroom1);
        hotel.checkIn(guest2, bedroom1);
        assertEquals(2, bedroom1.getNumberOfGuests());
    }

    @Test
    public void testCheckOut(){
        hotel.checkIn(guest, bedroom1);
        hotel.checkOut(guest, bedroom1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

//    @Test
//    public void testCheckGuest(){
//        assertEquals("Danny", hotel.checkGuest());
//    }










}
