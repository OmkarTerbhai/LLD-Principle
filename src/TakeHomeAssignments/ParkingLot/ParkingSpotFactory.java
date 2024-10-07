package TakeHomeAssignments.ParkingLot;

public class ParkingSpotFactory {
    public static ParkingSpot getParkingSpot(Vehicle v) {
        ParkingSpot parkingSpot = null;

        if(v.getSize() == 2) {
            parkingSpot = new MotorcycleSpot();
            if(parkingSpot.isFull()) {
                parkingSpot = new CarSpot();
                if(parkingSpot.isFull())
                    parkingSpot = new TruckSpot();
            }
        }
        else if(v.getSize() == 4) {
            parkingSpot = new CarSpot();

            if(parkingSpot.isFull())
                parkingSpot = new TruckSpot();
        }
        else {
            parkingSpot = new TruckSpot();
        }

        return parkingSpot;
    }
}
