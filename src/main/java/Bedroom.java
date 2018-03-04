public class Bedroom extends Room {


    private double cost;
    private Type type;
    private boolean available;

    public Bedroom(int roomNumber, int capacity, Type type, double cost) {
        super(roomNumber, capacity);
        this.type = type;
        this.cost = cost;
        this.available = true;

    }

    public Type getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public boolean isAvailable() {
        return available;
    }

    public void changeStatus(){
        available = !available;
    }
}
