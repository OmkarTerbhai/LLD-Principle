package Lesson5_Practice_ISP.ProblematicCode;

public class CurrentAccount implements Account{
    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrawing from Current Acc");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Depositing to a Current Account");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking balance of a Current Account");
    }

    @Override
    public void getMaturityPeriod() {
        //No maturity period, so empty impl.
    }

    @Override
    public boolean isPartiallyWithdrawable() {
        //Partial/Full doesn't make sense here, returning false also doesn't make sense
        return false;
    }

    @Override
    public void payEMI() {
        //EMI not valid in a current acc, so empty impl.
    }
}
