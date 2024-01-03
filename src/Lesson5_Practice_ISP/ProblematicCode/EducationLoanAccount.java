package Lesson5_Practice_ISP.ProblematicCode;

public class EducationLoanAccount implements Account{

    @Override
    public void withdraw(int amount) {
        System.out.println("Amount withdrawn");
    }

    @Override
    public void deposit(int amount) {
        //User cannot deposit, so empty impl
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Education Loan Bal is : ");
    }

    @Override
    public void getMaturityPeriod() {
        //Due Date is applicable not maturity so empty impl
    }

    public boolean isPartiallyWithdrawable() {
        return true;
    }

    @Override
    public void payEMI() {
        System.out.println("Education Loan EMI Paid!!");
    }
}
