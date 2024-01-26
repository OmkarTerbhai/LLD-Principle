package Lesson9.AdapterPattern.BetterCode;

public class RazorPay {
    public void makePayment() {
    }

    public void getPaymentDetails(String pid) {

    }

    public String getStatus(String pid) {
        return pid + "_succeeded";
    }
}