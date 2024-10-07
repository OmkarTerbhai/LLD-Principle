package TakeHomeAssignments.ParkingLot;

public class TruckSpot implements ParkingSpot {

    public static int totalSpaces = 200;
    public int spaceSize;
    public TruckSpot() {
        this.spaceSize = 8;
    }
    @Override
    public void allocate(Vehicle vehicle) {
        if(vehicle.getSize() > this.spaceSize) {
            throw new IllegalArgumentException("Cannot park a large vehicle in a Truck spot");
        }
        if(vehicle.getSize() >= totalSpaces) {
            throw new IllegalArgumentException("No vacant spots remaining for parking");
        }
        totalSpaces -= vehicle.getSize();
        System.out.println("Parking space is available and allocated, please proceed to park your vehicle");
    }

    @Override
    public void deallocate(Vehicle vehicle) {
        totalSpaces += vehicle.getSize();
        System.out.println("Thank you for visiting, have a great day...");
    }

    public boolean isFull() {
        return totalSpaces == 0;
    }
}
