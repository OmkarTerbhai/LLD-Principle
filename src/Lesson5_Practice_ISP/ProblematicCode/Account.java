package Lesson5_Practice_ISP.ProblematicCode;

public interface Account {
    public void withdraw(int amount);

    public void deposit(int amount);

    public void checkBalance(int accNo);

    public void getMaturityPeriod();

    public boolean isPartiallyWithdrawable();

    public void payEMI();
}
