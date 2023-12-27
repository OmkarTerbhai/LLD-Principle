package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode.VehicleInsurance;

public class InsuranceEvaluator {
    public void evaluateInsurance(Vehicle vehicle) {
        InsuranceQuote insuranceQuote = new InsuranceQuote(vehicle);
        insuranceQuote.assesInsuranceIncident();
    }
}
