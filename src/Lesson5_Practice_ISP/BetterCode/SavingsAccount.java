package Lesson5_Practice_ISP.BetterCode;

public class SavingsAccount implements IDeposit{
    @Override
    public void withdraw() {
        System.out.println("Withdrawing from Savings Acc");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Savings Acc Balance is");
    }

    @Override
    public void deposit() {
        System.out.println("Making a Savings Account deposit");
    }
}
