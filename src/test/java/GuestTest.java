import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp() throws Exception {
        guest = new Guest("Danny");
    }

    @Test
    public void testGuestName() {
        assertEquals("Danny", guest.getName());
    }
}
