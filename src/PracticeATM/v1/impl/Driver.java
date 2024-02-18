package PracticeATM.v1.impl;

public class Driver {
    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println("Welcome to ATM...");


        atm.init();

        System.out.println("Transaction in progress...");
        atm.init();
        atm.nextStage();
        System.out.println("Card Reading stage.....");
        atm.init();
        atm.nextStage();
        atm.init();
    }
}
