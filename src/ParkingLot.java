public class ParkingLot {

    private int capacity;
    private int availability;

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

    public void addCar() {

        if(!this.isFull())

        availability --;
        else
            System.out.println ("No more slots avaialble for another car " );
    }

    public void removeCar() {

        availability ++;
    }
}
