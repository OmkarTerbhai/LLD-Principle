package TakeHomeAssignments.ParkingLot;

public interface ParkingSpot {
    void allocate(Vehicle vehicle);
    void deallocate(Vehicle vehicle);
    boolean isFull();
}
