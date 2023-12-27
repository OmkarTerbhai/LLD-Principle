package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode.VehicleInsurance;

public class InsuranceQuote {
    Vehicle vehicle;

    public InsuranceQuote(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void assesInsuranceIncident() {
        this.vehicle.assesDamages();
    }
}
