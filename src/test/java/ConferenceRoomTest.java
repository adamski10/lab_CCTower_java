import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(3, "Meeting room 1");
        guest = new Guest("Mike");
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
}
