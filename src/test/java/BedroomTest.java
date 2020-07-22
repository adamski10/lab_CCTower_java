import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom doubleBedroom;
    private Bedroom singleBedroom;
    private Guest guest;

    @Before
    public void before(){
        doubleBedroom = new Bedroom(2, 10, "double");
        singleBedroom = new Bedroom(1, 12, "single");
        guest = new Guest("Mike");

    }

    @Test
    public void canGetRoomDetails(){
        assertEquals(2, doubleBedroom.getCapacity());
        assertEquals(10, doubleBedroom.getRoomNumber());
        assertEquals("double", doubleBedroom.getType());
    }

    @Test
    public void canAddGuest(){
        doubleBedroom.addGuest(guest);
        assertEquals(1, doubleBedroom.getAmount());
    }

    @Test
    public void canNotAddGuest(){
        singleBedroom.addGuest(guest);
        singleBedroom.addGuest(guest);
        assertEquals(1, singleBedroom.getAmount());
    }
}
