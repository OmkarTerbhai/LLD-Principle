package Lesson9.AdapterPattern.BetterCode;

public class StripePaymentAdapter implements PaymentGatewayAdapter{
    Stripe stripe = new Stripe();

    public void makePayment() {
        stripe.initPayment();
    }

    public String getStatus(InquirePaymentRequest request) {
        return this.stripe.getStatus(request);
    }

    /**
     * If Stripe changes internal impl. , only change this method.
     * @param request
     */
    public void getPaymentDetails(InquirePaymentRequest request) {
        this.stripe.getPaymentDetails(request);
    }

}
