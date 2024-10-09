package Practice_FactoryPattern.BetterCode;

import java.util.Scanner;

public class CoffeeMakerMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String whichCoffee = in.nextLine();
        IngredientCreatorFactory icf;
        if("Latte".equals(whichCoffee)) {
            icf = new LatteCreatorFactory();
        } else if ("Espresso".equals(whichCoffee)) {
            icf = new EspressoCreatorFactory();
        }
        else {
            icf = new CappuccinoCreatorFactory();
        }

        icf.makeCoffee();
    }
}
