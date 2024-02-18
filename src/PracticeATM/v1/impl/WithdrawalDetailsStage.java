package PracticeATM.v1.impl;

import PracticeATM.v1.ATMState;

import java.util.Scanner;

public class WithdrawalDetailsStage implements ATMState {

    ATM atm;

    public WithdrawalDetailsStage(ATM atm) {
        this.atm = atm;
    }

    public void collectWithdrawalDetails() {
        System.out.println("Enter required amount: ");
        Scanner in = new Scanner(System.in);
        this.atm.amount = in.nextInt();
    }
    @Override
    public void init() {
        this.collectWithdrawalDetails();
    }

    @Override
    public void cancelTxn() {
        this.atm.changeState(StateFactory.getState(ATMStateEnum.READY,atm));
    }

    @Override
    public void nextState() {
        this.atm.changeState(StateFactory.getState(ATMStateEnum.CASH_DISPENSING, atm));
    }
}
