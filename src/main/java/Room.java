import java.util.ArrayList;

public abstract class Room {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        guests = new ArrayList<>();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
}
