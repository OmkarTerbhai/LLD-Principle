package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public class ElectronicsType implements ProductType {
    @Override
    public String getType() {
        return "Electronics";
    }

    @Override
    public double getDiscountRate() {
        return 0.10;
    }


}
