package PracticeATM.v1.impl;

import PracticeATM.v1.Card;
import PracticeATM.v1.CardType;
import PracticeATM.v1.State;

public class ATM {
    State currState;
    String txnId;

    Card card;
    String cardNo;
    CardType type;

    long amount;

    public ATM() {
        this.currState = new ReadyState(this);
    }
    public void changeState(State s) {
        this.currState = s;
    }

    public void init() {
        this.currState.init();
    }

    public void cancel() {
            this.currState.cancelTxn();
    }

    public void nextStage() {
        this.currState.nextState();
    }
}
