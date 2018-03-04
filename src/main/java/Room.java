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

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest){
        if(getNumberOfGuests() < capacity){
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public String getGuests() {
        String names = "";
        for(Guest guest : guests) {
            names = names + guest.getName() + " ";
        }
        return names;
    }

}
