import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        bedrooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
    }

    public int getNumberOfBedrooms(){
        return bedrooms.size();
    }

    public int getNumberOfDiningRooms(){
        return diningRooms.size();
    }

    public int getNumberOfConferenceRooms(){
        return conferenceRooms.size();
    }


}
