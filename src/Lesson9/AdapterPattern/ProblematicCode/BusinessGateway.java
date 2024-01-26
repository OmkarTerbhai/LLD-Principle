package Lesson9.AdapterPattern.ProblematicCode;

public class BusinessGateway {
    RazorPay rzp = new RazorPay();

    public void makePayment() {
        System.out.println("Making a payment for a business item");
        rzp.makePayment();
    }

    public void getPaymentDetails() {
        System.out.println("Here are the payment details");
        rzp.getPaymentDetails();
    }
}
