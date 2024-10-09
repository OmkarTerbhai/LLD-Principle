package Practice_FactoryPattern.BetterCode;

import Practice_FactoryPattern.BetterCode.Coffee;

public class Espresso implements Coffee {

    IngredientCreatorFactory icf;
    public Espresso(IngredientCreatorFactory icf) {
        this.icf = icf;
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making Espresso coffee");
    }
}
