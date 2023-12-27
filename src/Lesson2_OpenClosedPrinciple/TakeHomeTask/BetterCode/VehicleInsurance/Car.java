package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode.VehicleInsurance;

public class Car implements Vehicle{
    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public void assesDamages() {
        System.out.println("Checking front bumper");
        System.out.println("Checking door condition");
        System.out.println("Examining dashcam footage");
    }
}
