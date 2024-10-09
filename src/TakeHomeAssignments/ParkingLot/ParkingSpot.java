package TakeHomeAssignments.ParkingLot;

public interface ParkingSpot {
    boolean allocate(Vehicle vehicle);
    boolean deallocate(Vehicle vehicle);

    int getRemainingSpace();

    boolean isOccupied();

    boolean hasSpace(Vehicle vehicle);
}
