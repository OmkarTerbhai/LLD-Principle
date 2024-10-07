package Lesson5_Practice_ISP.BetterCode;

public class CurrentAccount implements IDeposit{
    @Override
    public void withdraw() {
        System.out.println("Withdrawing from Current Acc");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking Current Acc Balance");
    }

    @Override
    public void deposit() {
        System.out.println("Making Current Acc Deposit");
    }
}
