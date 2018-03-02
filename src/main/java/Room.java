import java.util.ArrayList;

public abstract class Room {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        guests = new ArrayList<>();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}
