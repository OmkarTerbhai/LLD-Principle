package Lesson9.AdapterPattern.BetterCode;


public class RazorPayAdapter implements PaymentGatewayAdapter{
    RazorPay rzp = new RazorPay();

    public void makePayment() {
        rzp.makePayment();
    }

    public String getStatus(String pid) {
        return this.rzp.getStatus(pid);
    }

    /**
     * If RazorPay changes internal impl. , only change this method.
     */
    public void getPaymentDetails(String pid) {
        this.rzp.getPaymentDetails(pid);
    }
}
