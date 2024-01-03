package Lesson5_Practice_ISP.ProblematicCode;

public class SavingsAccount implements Account {

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrawing from Savings Acc");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Depositing to a Savings Account");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking balance of a Savings Account");
    }

    @Override
    public void getMaturityPeriod() {
        //No maturity period, so empty impl.
    }

    @Override
    public boolean isPartiallyWithdrawable() {
        //Partial withdrawal doesn't make sense here
        return false;
    }

    @Override
    public void payEMI() {
        //Cannot pay EMI TO this acc, so empty impl
    }
}
