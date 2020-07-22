import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomType;
    private ArrayList<ConferenceRoom> conferenceRoom;

    public Hotel(){
        this.bedroomType = new ArrayList<Bedroom>();
        this.conferenceRoom = new ArrayList<ConferenceRoom>();
    }



    public int howManyBookedBedrooms(){
        return this.bedroomType.size();
    }

    public int howManyBookedConferenceRooms(){
        return this.conferenceRoom.size();
    }



    public void addBedroom(Bedroom bedroom){
        this.bedroomType.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRoom.add(conferenceRoom);
    }



    public void checkInBedroom(Bedroom bedroom, Guest guest){
        bedroom.addGuest(guest);
    }
    public void checkOutBedroom(Bedroom bedroom, Guest guest){
        bedroom.removeGuest(guest);
    }



    public void checkInConferenceRoom(ConferenceRoom conferenceRoom, Guest guest){
        conferenceRoom.addGuest(guest);
    }
    public void checkOutConferenceRoom(ConferenceRoom conferenceRoom, Guest guest){
        conferenceRoom.removeGuest(guest);
    }


}
