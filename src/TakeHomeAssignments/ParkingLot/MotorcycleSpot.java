package TakeHomeAssignments.ParkingLot;

public class MotorcycleSpot implements ParkingSpot {

    private static final int TOTAL_SPACE = 2;
    public int usedSpace;
    private boolean isOccupied;

    public MotorcycleSpot() {
        this.usedSpace = 0;
        this.isOccupied = false;
    }
    @Override
    public boolean allocate(Vehicle vehicle) {
        if(isOccupied()) {
            throw new IllegalArgumentException("Parking spot is occupied");
        }
        if(!hasSpace(vehicle)) {
            throw new IllegalArgumentException("No space to park vehicle");
        }
        usedSpace += vehicle.getSize();
        if(getRemainingSpace() == 0)
            isOccupied = true;

        return true;
    }

    @Override
    public boolean deallocate(Vehicle vehicle) {
        if(usedSpace >= vehicle.getSize()) {
            usedSpace -= vehicle.getSize();
            if(usedSpace == 0)
                isOccupied = false;
            return true;
        }
        System.out.println("Vehicle not parked here");
        return false;
    }

   @Override
    public int getRemainingSpace() {
        return TOTAL_SPACE - usedSpace;
   }

    @Override
    public boolean isOccupied() {
        return isOccupied;
    }

    @Override
    public boolean hasSpace(Vehicle vehicle) {
        return getRemainingSpace() >= vehicle.getSize();
    }
}
