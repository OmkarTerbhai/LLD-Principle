package Lesson9.AdapterPattern.BetterCode;

public class Stripe {

    public void initPayment() {
    }

    public void getPaymentDetails(InquirePaymentRequest request) {
    }

    public String getStatus(InquirePaymentRequest request) {
        return request.pid + "_succeeded" + request.time;
    }
}
