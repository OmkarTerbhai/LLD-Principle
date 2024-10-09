package Practice_FactoryPattern.BetterCode;

import Practice_FactoryPattern.BetterCode.Coffee;

public class Latte implements Coffee {

    IngredientCreatorFactory icf;

    public Latte(IngredientCreatorFactory icf) {
        this.icf = icf;
    }
    @Override
    public void makeCoffee() {
        System.out.println("Making a delicious latte...");
    }
}
