package PracticeATM.v1.impl;

import PracticeATM.v1.State;

public class StateFactory {
    public static State getState(ATMStateEnum stateEnum, ATM atm) {
        if(ATMStateEnum.READY.equals(stateEnum)) {
            return new ReadyState(atm);
        }
        else if(ATMStateEnum.CARD_READING.equals(stateEnum)) {
            return new CardReadingStage(atm);
        }
        else if(ATMStateEnum.WITHDRAWAL_READING.equals(stateEnum)) {
            return new WithdrawalDetailsStage(atm);
        }
        else if(ATMStateEnum.CASH_DISPENSING.equals(stateEnum)) {
            return new CashDispensingStage(atm);
        }
        return null;
    }
}
