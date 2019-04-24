public class Car implements Parkable {

    private String name;

    public Car ( String name)
    {
        this.name = name;
    }

    @Override
    public void park ( ParkingLot parkingLot)
    {

        if (parkingLot.addVehicle())

           System.out.println ( "car " + this.name + " is parked. No of slots available: "+ parkingLot.availability);
       else
            System.out.println ( "car " + this.name + " is not parked. No slots available");
    }

    @Override
    public void unpark ( ParkingLot parkingLot)
    {
        parkingLot.removeVehicle();
        System.out.println ("car " + this.name + " is un parked. No of slots available: "+ parkingLot.availability);

    }

}
