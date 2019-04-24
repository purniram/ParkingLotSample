public class ParkingLot {

    private int capacity;
    public int availability;

    public  ParkingLot( int capacity)
    {
        this.capacity = capacity;
        this.availability = capacity;
    }

    public boolean isFull ()
    {
        if(availability == 0)
            return true;

        else
            return false;
    }

    public boolean addVehicle() {

        if(!this.isFull())

        { availability --;
           return true; }
        else
        {
            return false;
        }
    }

    public void removeVehicle() {

        availability ++;

    }
}
