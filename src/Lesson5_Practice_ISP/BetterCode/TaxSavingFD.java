package Lesson5_Practice_ISP.BetterCode;

public class TaxSavingFD implements IFixedDeposit{
    @Override
    public void withdraw() {
        System.out.println("Withdrawal of Tax Saving FD in process");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking Tax Saving FD Balance");
    }

    @Override
    public void deposit() {
        System.out.println("making a tax saving fd deposit");
    }

    @Override
    public void getMaturityPeriod() {
        System.out.println("5 years");
    }
}
