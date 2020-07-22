import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom doubleBedroom;
    private Bedroom singleBedroom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void before(){
        doubleBedroom = new Bedroom(2, 10, "double");
        singleBedroom = new Bedroom(1, 12, "single");
        guest = new Guest("Mike");
        guest2 = new Guest("Alex");


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

    @Test
    public void canCheckForGuest(){
        singleBedroom.addGuest(guest);
        assertEquals(true, singleBedroom.checkForGuest(guest));
    }

    @Test
    public void canCheckForNonGuest(){
        singleBedroom.addGuest(guest);
        assertEquals(false, singleBedroom.checkForGuest(guest2));
    }

    @Test
    public void canRemoveGuest(){
        singleBedroom.addGuest(guest);
        assertEquals(1, singleBedroom.getAmount());
        singleBedroom.removeGuest(guest);
        assertEquals(0, singleBedroom.getAmount());
    }
}
