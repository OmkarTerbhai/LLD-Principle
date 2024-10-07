package TakeHomeAssignments.ParkingLot;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome....");

            System.out.println("Enter your vehicle type: ");
            String vehicleType = in.nextLine();

            Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
            ParkingSpot parkingSpot = ParkingSpotFactory.getParkingSpot(vehicle);

            System.out.println("1. Park");
            System.out.println("2. UnPark");
            System.out.println("3. Exit");

            int option = in.nextInt();
            in.nextLine();

            if (option == 1) {
//                if (parkingSpot.isFull())
//                    throw new IllegalArgumentException("Sorry, all parking spots are occupied, try visiting later");
                parkingSpot.allocate(vehicle);
            } else if(option == 2) {
                parkingSpot.deallocate(vehicle);
            }
            else {
                break;
            }
        }
    }
}
