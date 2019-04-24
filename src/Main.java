public class Main {

    public static void main(String[] args) {
        //System.out.println();
        //System.out.println("Hello World!");


        Vehicle car1 = new Car("car1");
        Vehicle car2 = new Car("car2");
        Vehicle car3 = new Car("car3");

        Vehicle Jeep1 = new Jeep ("Jeep1");
        Vehicle Jeep2 = new Jeep ("Jeep2");
        ParkingLot parkingLot = new ParkingLot(6);

        car1.park(parkingLot);
        car2.park(parkingLot);

        Jeep1.park(parkingLot);

        car2.unpark(parkingLot);

        Jeep2.park(parkingLot);

        System.out.println();
        System.out.println ( "no of slots available: " + parkingLot.availability );
        System.out.println ("Is the parking lot full: " + parkingLot.isFull());

    }
}
