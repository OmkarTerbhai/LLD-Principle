package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode.Product;

public class DiscountCalculator {
    public double getDiscountedPrice(Product product) {
        return product.getPrice() * product.getDiscountRate();
    }
}
