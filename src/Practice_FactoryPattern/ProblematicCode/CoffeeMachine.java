package Practice_FactoryPattern.ProblematicCode;

import java.util.Scanner;

public class CoffeeMachine {
    /**
     * Violates DIP
     * Violates OCP
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String whichCoffee = in.nextLine();
        Coffee coffee;

        if("Latte".equals(whichCoffee)) {
            coffee = new Latte();
        } else if ("Espresso".equals(whichCoffee)) {
            coffee = new Espresso();
        }
        else {
            coffee = new Cappuccino();
        }
    }
}
