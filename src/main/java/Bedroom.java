import java.awt.print.Book;
import java.util.ArrayList;

public class Bedroom {
    private int capacity;
    private int roomNumber;
    private ArrayList<Guest> checkedIn;
    private String type;
    private Boolean status;

    public Bedroom(int capacity, int roomNumber, String type, Boolean status){
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.checkedIn = new ArrayList<Guest>();
        this.type = type;
        this.status = status;
    }

    public int getCapacity(){return capacity;}

    public int getRoomNumber(){return roomNumber;}

    public String getType(){return type;}

    public ArrayList getCheckedIn(){return checkedIn;}

    public int getAmount(){return checkedIn.size();}

    public Boolean hasCapacity(){return capacity > checkedIn.size();}

    public void addGuest(Guest guest){
        if(hasCapacity()) {
            this.checkedIn.add(guest);
        }
    }

    public Boolean checkForGuest(Guest guestToCheck){
        for(Guest guest : this.checkedIn){
            if(guest == guestToCheck) {
                return true;
            }
        }
        return false;
    }

    public void removeGuest(Guest guest){
        if (checkForGuest(guest) == true){
            int index = this.checkedIn.indexOf(guest);
            this.checkedIn.remove(index);

        }
    }
    public Boolean getStatus(){
        return this.status;
    }

    public void setStatusTrue(){
        this.status = true;
    }

    public void setStatusFalse(){
        this.status = false;
    }



}
