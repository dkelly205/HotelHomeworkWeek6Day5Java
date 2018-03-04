import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void setUp() throws Exception {
        hotel = new Hotel();
    }

    @Test
    public void getNumberOfBedrooms(){
        assertEquals(0, bedrooms.getNumberOfBedrooms);
    }
}
