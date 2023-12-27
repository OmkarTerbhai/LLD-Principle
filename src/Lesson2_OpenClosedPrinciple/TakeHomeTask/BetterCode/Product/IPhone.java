package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode.Product;

public class IPhone extends ElectronicsType implements Product{
    @Override
    public double getPrice() {
        return 100000 * getDiscountRate();
    }
}
