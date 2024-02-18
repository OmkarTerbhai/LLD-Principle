package PracticeATM.v1.impl;

import PracticeATM.v1.ATMState;

import java.util.UUID;

public class ReadyState implements ATMState {
    private ATM atm;

    public ReadyState(ATM atm) {
        this.atm = atm;
    }


    @Override
    public void init() {
        String txnId = UUID.randomUUID().toString();
        this.atm.txnId = txnId;
        nextState();
    }

    @Override
    public void cancelTxn() {
        throw new UnsupportedOperationException("Cannot Cancel here");
    }

    @Override
    public void nextState() {
        this.atm.changeState(StateFactory.getState(ATMStateEnum.CARD_READING, this.atm));
    }

}
