public class ConferenceRoom extends Room {

    private double cost;

    public ConferenceRoom(int roomNumber, int capacity, double cost) {
        super(roomNumber, capacity);
        this.cost = cost;
    }


    public double getCost() {
        return this.cost;
    }
}
