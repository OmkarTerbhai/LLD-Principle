package Lesson9.AdapterPattern.BetterCode;

public interface PaymentGatewayAdapter {
    default boolean isGatewayUp() {
        return true;
    }

    default void sendPaymentNotification() {
        System.out.println("Sending payment notification");
    }
}
