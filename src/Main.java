public class Main {

    public static void main(String[] args) {
        //System.out.println();
        //System.out.println("Hello World!");


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        ParkingLot parkingLot = new ParkingLot(4);

        car1.park(parkingLot);
        car2.park(parkingLot);



        car2.unpark(parkingLot);

        car3.park(parkingLot);

        System.out.println ( "no of slots available: " + parkingLot.availability );
        System.out.println ("Is the parking lot full: " + parkingLot.isFull());

    }
}
