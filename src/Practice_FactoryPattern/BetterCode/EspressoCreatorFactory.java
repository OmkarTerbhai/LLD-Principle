package Practice_FactoryPattern.BetterCode;

public class EspressoCreatorFactory extends IngredientCreatorFactory{

    Espresso espresso;
    public EspressoCreatorFactory() {
        this.espresso = new Espresso(this);
    }

    public void makeCoffee() {
        espresso.makeCoffee();
    }
}
