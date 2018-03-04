import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom(201, 1, Type.SINGLE, 30.00);
        bedroom2 = new Bedroom(201, 2, Type.DOUBLE, 30.00);
        guest1 = new Guest("Danny");
        guest2 = new Guest("Tina");
    }

    @Test
    public void testRoomNumber() {
        assertEquals(201, bedroom.getRoomNumber());
    }

    @Test
    public void testCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void testBedroomType(){
        assertEquals(Type.SINGLE, bedroom.getType());
    }

    @Test
    public void testBedroomCost(){
        assertEquals(30.00, bedroom.getCost(), 0.01);
    }

    @Test
    public void testBedroomIsAvailable(){
        assertEquals(true, bedroom.isAvailable());
    }

    @Test
    public void testBedroomIsUnavailable(){
        bedroom.changeStatus();
        assertEquals(false, bedroom.isAvailable());
    }

    @Test
    public void testGetGuests(){
        bedroom2.addGuest(guest1);
        bedroom2.addGuest(guest2);
        assertEquals("Danny Tina ", bedroom2.getGuests());
    }



}
