package Practice_FactoryPattern.BetterCode;

public class CappuccinoCreatorFactory extends IngredientCreatorFactory {

    Cappuccino cappuccino;

    public CappuccinoCreatorFactory() {
        this.cappuccino = new Cappuccino(this);
    }

    public void makeCoffee() {
        cappuccino.makeCoffee();
    }
}
