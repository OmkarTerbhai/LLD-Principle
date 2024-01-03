package Lesson5_Practice_ISP.ProblematicCode;

public class TermLoanAccount implements Account{

    @Override
    public void withdraw(int amount) {
        System.out.println("Full withdrawal in process...");
    }

    @Override
    public void deposit(int amount) {
        //Only bank can deposit, so empty impl.
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking Loan Acc Balance...");
    }

    @Override
    public void getMaturityPeriod() {
        //Has term/due date and NOT maturity, so empty impl.
    }

    @Override
    public boolean isPartiallyWithdrawable() {
        return false;
    }

    @Override
    public void payEMI() {
        System.out.println("EMI Paid!!");
    }
}
