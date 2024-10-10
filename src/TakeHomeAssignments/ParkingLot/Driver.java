package TakeHomeAssignments.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Driver {

    private static final List<ParkingSpot> motorcycleSpots = new ArrayList<>();
    private static final List<ParkingSpot> carSpots = new ArrayList<>();
    private static final List<ParkingSpot> truckSpots = new ArrayList<>();

    public Driver(int motorCycleSpotsNum, int carSpotsNum, int truckSpotsNum) {
        for(int i = 1; i <= motorCycleSpotsNum; i++) {
            motorcycleSpots.add(new MotorcycleSpot());
        }

        for(int i = 1; i <= carSpotsNum; i++) {
            carSpots.add(new CarSpot());
        }

        for(int i = 1; i <= truckSpotsNum; i++) {
            truckSpots.add(new TruckSpot());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of motorcycle, car and truck spots...");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        in.nextLine();
        Driver d = new Driver(n1, n2, n3);
        while(true) {
            System.out.println("Welcome....");

            System.out.println("Enter your vehicle type: ");
            String vehicleType = in.nextLine();

            Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);

            System.out.println("1. Park");
            System.out.println("2. UnPark");
            System.out.println("3. Exit");

            int option = in.nextInt();
            in.nextLine();

            if (option == 1) {
                ParkingSpot p = getNextParkingSpot(vehicle);
                if (Objects.nonNull(p))
                    p.allocate(vehicle);
                else
                    System.out.println("No free slot found");
            } else if (option == 2) {
                ParkingSpot p = getNextOccupiedParkingSpot(vehicle);
                if (Objects.nonNull(p))
                    p.deallocate(vehicle);
                else
                    System.out.println("No occupied free slot");
            } else {
                break;
            }
        }
    }

    private static ParkingSpot getNextMotorcycleSpot() {
        for(ParkingSpot m : motorcycleSpots) {
            if(!m.isOccupied())
                return m;
        }
        return getNextCarSpot();
    }

    private static ParkingSpot getNextCarSpot() {
        for(ParkingSpot m : carSpots) {
            if(!m.isOccupied())
                return m;
        }
        return getNextTruckSpot();
    }

    private static ParkingSpot getNextTruckSpot() {
        for(ParkingSpot m : truckSpots) {
            if(!m.isOccupied())
                return m;
        }
        return null;
    }

    private static ParkingSpot getNextParkingSpot(Vehicle v) {
        if(v.getSize() == 2)
            return getNextMotorcycleSpot();
        else if(v.getSize() == 4)
            return getNextCarSpot();
        else
            return getNextTruckSpot();
    }

    private static ParkingSpot getNextOccupiedMotorcycleSpot() {
        for(ParkingSpot m : motorcycleSpots) {
            if(m.isOccupied())
                return m;
        }
        return getNextCarSpot();
    }

    private static ParkingSpot getNextOccupiedCarSpot() {
        for(ParkingSpot m : carSpots) {
            if(m.isOccupied())
                return m;
        }
        return getNextTruckSpot();
    }

    private static ParkingSpot getNextOccupiedTruckSpot() {
        for(ParkingSpot m : truckSpots) {
            if(m.isOccupied())
                return m;
        }
        return null;
    }

    private static ParkingSpot getNextOccupiedParkingSpot(Vehicle v) {
        if(v.getSize() == 2)
            return getNextOccupiedMotorcycleSpot();
        else if(v.getSize() == 4)
            return getNextOccupiedCarSpot();
        else
            return getNextOccupiedTruckSpot();
    }
}
