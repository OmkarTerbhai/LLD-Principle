package Lesson5_Practice_ISP.ProblematicCode;

public class FixedDeposit implements Account{
    @Override
    public void withdraw(int amount) {
        System.out.println("Full Withdrawal in process");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Making a FD deposit");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking FD balance");
    }

    @Override
    public void getMaturityPeriod() {
        System.out.println("3 years");
    }

    @Override
    public boolean isPartiallyWithdrawable() {
        return false;
    }

    @Override
    public void payEMI() {
        //No EMI applicable so empty impl.
    }
}
