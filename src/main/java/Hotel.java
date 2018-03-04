import java.util.ArrayList;

public class Hotel {
    
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        bedrooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void checkIn(Guest guest, Bedroom bedroom){
        bedroom.addGuest(guest);
        bedroom.changeStatus();
    }

    public void checkOut(Guest guest, Bedroom bedroom){
        bedroom.removeGuest(guest);
        bedroom.isAvailable();
    }

//    public String checkGuest(Guest guest){
//        for(Room bedroom : bedrooms){
//            bedroom.getGuests();
//        }
//
//    }




}
