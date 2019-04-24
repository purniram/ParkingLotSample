public abstract class Vehicle implements Parkable {

    private String name;

    protected Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void park ( ParkingLot parkingLot)
    {

        if (parkingLot.addVehicle())

            System.out.println ( this.name + " is parked. No of slots available: "+ parkingLot.availability);
        else
            System.out.println ( this.name + " is not parked. No slots available");
    }

    @Override
    public void unpark ( ParkingLot parkingLot)
    {
        parkingLot.removeVehicle();
        System.out.println ( this.name + " is un parked. No of slots available: "+ parkingLot.availability);

    }


}
