package Lesson5_Practice_ISP.ProblematicCode;

public class TaxSavingFD implements Account{
    @Override
    public void withdraw(int amount) {
        System.out.println("Amount withdrawn");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Making a Tax Saving FD deposit");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking FD balance");
    }

    @Override
    public void getMaturityPeriod() {
        System.out.println("5 years");
    }

    @Override
    public boolean isPartiallyWithdrawable() {
        return false;
    }

    @Override
    public void payEMI() {
        //EMI NA, so empty impl
    }
}
