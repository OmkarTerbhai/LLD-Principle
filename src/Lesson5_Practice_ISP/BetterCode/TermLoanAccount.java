package Lesson5_Practice_ISP.BetterCode;

public class TermLoanAccount implements ILoan{
    @Override
    public void withdraw() {
        System.out.println("Withdrawal of term loan amount in process");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Loan Acc Balance is");
    }

    @Override
    public void payEMI() {
        System.out.println("EMI Paid");
    }
}
