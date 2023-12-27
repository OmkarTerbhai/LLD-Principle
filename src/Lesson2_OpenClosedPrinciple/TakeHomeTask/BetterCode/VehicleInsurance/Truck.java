package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode.VehicleInsurance;

public class Truck implements Vehicle{
    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public void assesDamages() {
        System.out.println("Examining dashcam footage");
        System.out.println("Checking front bumper");
        System.out.println("Checking door condition");
        System.out.println("Check goods damage");
    }
}
