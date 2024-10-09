package Practice_FactoryPattern.BetterCode;

import Practice_FactoryPattern.BetterCode.Coffee;

public class Cappuccino implements Coffee {

    IngredientCreatorFactory icf;
    public Cappuccino(IngredientCreatorFactory icf) {
        this.icf = icf;
    }

    @Override
    public void makeCoffee() {
        System.out.println("making a cappuccino");
    }
}
