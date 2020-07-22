import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(3, "Meeting room 1");
        guest = new Guest("Mike");
        guest2 = new Guest("John");
    }

    @Test
    public void canGetConferenceRoomDetails(){
        assertEquals(3, conferenceRoom.getCapacity());
        assertEquals("Meeting room 1", conferenceRoom.getRoomName());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getAmount());
    }

    @Test
    public void canNotAddGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);

        assertEquals(3, conferenceRoom.getAmount());
    }

    @Test
    public void canCheckForGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(true, conferenceRoom.checkForGuest(guest));
    }

    @Test
    public void canCheckForNonGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(false, conferenceRoom.checkForGuest(guest2));
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getAmount());
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getAmount());
    }
}
