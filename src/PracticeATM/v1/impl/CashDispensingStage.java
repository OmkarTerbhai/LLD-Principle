package PracticeATM.v1.impl;

import PracticeATM.v1.ATMState;
import PracticeATM.v1.IWithdraw;

public class CashDispensingStage implements ATMState, IWithdraw {
    ATM atm;

    public CashDispensingStage(ATM atm) {
        this.atm = atm;
    }
    @Override
    public void dispenseCash() {
        System.out.println("Dispensing Cash...");
        System.out.println("Please collect your Rs." + this.atm.amount);

        System.out.println("Charges deducted: " + atm.card.getCharges());
    }

    @Override
    public void init() {
        this.dispenseCash();
    }

    @Override
    public void cancelTxn() {
        this.atm.changeState(
                StateFactory.getState(ATMStateEnum.READY, atm));
    }

    @Override
    public void nextState() {
        /*Cash is successfully dispensed, so prepare for next txn*/
        this.atm.changeState(StateFactory.getState(ATMStateEnum.READY, atm));
    }
}
