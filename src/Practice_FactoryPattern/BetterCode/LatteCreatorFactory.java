package Practice_FactoryPattern.BetterCode;

public class LatteCreatorFactory extends IngredientCreatorFactory{
    Latte latte;

    public LatteCreatorFactory() {
        this.latte = new Latte(this);
    }

    public void makeCoffee() {
        latte.makeCoffee();
    }
}
