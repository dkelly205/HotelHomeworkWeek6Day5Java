import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom(201, 1, Type.SINGLE, 30.00);
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
}
