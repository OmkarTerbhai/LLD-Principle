package PracticeATM.v1.impl;

import PracticeATM.v1.ATMState;
import PracticeATM.v1.CardType;
import PracticeATM.v1.IReadCard;

import java.util.Scanner;

public class CardReadingStage implements ATMState, IReadCard {
    ATM atm;
    public CardReadingStage(ATM atm) {
        this.atm = atm;
    }
    @Override
    public void readCardDetails() {
        System.out.println("Reading Card details...");
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        if(type.equals("Credit")) {
            atm.type = CardType.CREDIT;
        }
        else {
            atm.type = CardType.DEBIT;
        }
        System.out.println("Take card number...");
        atm.cardNo = in.nextLine();
    }

    @Override
    public void validateCardDetails() {
        System.out.println("Validating card details");
        if(atm.cardNo.startsWith("6")) {
            atm.card = CardTypeFactory.getCard("Visa", atm.type);
        }
        else {
            atm.card = CardTypeFactory.getCard("RuPay", atm.type);
        }
    }

    @Override
    public void init() {
        this.readCardDetails();
        this.validateCardDetails();
    }

    @Override
    public void cancelTxn() {
        this.atm.changeState(StateFactory.getState(ATMStateEnum.READY, atm));
    }

    @Override
    public void nextState() {
        this.atm.changeState(StateFactory.getState(ATMStateEnum.WITHDRAWAL_READING, atm));
    }
}
