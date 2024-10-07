package TakeHomeAssignments.ParkingLot;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType) {
        Vehicle v = null;

        if("Car".equalsIgnoreCase(vehicleType)) {
            v = new Car();
        }
        else if("Motorcycle".equalsIgnoreCase(vehicleType)) {
            v = new Motorcycle();
        }
        else {
            v = new Truck();
        }

        return v;
    }
}
