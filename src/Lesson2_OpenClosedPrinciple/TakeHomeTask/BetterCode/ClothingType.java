package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public class ClothingType implements ProductType{
    @Override
    public String getType() {
        return "Clothing";
    }

    @Override
    public double getDiscountRate() {
        return 0.15;
    }
}
