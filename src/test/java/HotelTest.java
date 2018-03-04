import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Guest guest;

    @Before
    public void setUp() throws Exception {
        hotel = new Hotel("The Hilton");
        bedroom1 = new Bedroom(201, 1, Type.SINGLE, 30.00);
        guest = new Guest("Danny");
    }

    @Test
    public void getHotelName(){
        assertEquals("The Hilton", hotel.getName());
    }

    @Test
    public void checkGuestIn(){
        hotel.checkIn(guest, bedroom1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void checkGuestOut(){
        hotel.checkIn(guest, bedroom1);
        hotel.checkOut(guest, bedroom1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }


}
