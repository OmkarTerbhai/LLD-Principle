package TakeHomeAssignments.ParkingLot;

public class MotorcycleSpot implements ParkingSpot {

    public static int totalSpaces = 50;
    public int spaceSize;

    public MotorcycleSpot() {
        this.spaceSize = 2;
    }
    @Override
    public void allocate(Vehicle vehicle) {
        if(vehicle.getSize() > this.spaceSize) {
            throw new IllegalArgumentException("Cannot park a large vehicle in a motorcycle spot");
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
