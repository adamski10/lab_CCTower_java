import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;


    @Before
    public void before(){
        hotel = new Hotel();
        doubleBedroom = new Bedroom(2, 10, "double");
        singleBedroom = new Bedroom(1, 12, "single");
        conferenceRoom = new ConferenceRoom(3, "Meeting room 1");
        guest = new Guest("Mike");
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(singleBedroom);
        assertEquals(1, hotel.howManyBookedBedrooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.howManyBookedConferenceRooms());
    }

    @Test
    public void canCheckIntoBedroom(){
        hotel.checkInBedroom(singleBedroom, guest);
        assertEquals(1, singleBedroom.getAmount());
    }

    @Test
    public void canCheckOutBedroom(){
        hotel.checkOutBedroom(singleBedroom, guest);
        assertEquals(0, singleBedroom.getAmount());
    }

    @Test
    public void canCheckIntoConferenceRoom(){
        hotel.checkInConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.getAmount());
    }

    @Test
    public void canCheckOutConferenceRoom(){
        hotel.checkOutConferenceRoom(conferenceRoom, guest);
        assertEquals(0, conferenceRoom.getAmount());
    }
}

















