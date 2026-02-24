/**
 * Concrete implementation of NotificationMedium that simulates
 * sending messages via SMS.
 *
 * Responsibilities:
 * - Implements SMS-based delivery behavior
 * - Adheres to NotificationMedium contract
 *
 * @author Will Shahbazian
 * @version 1.0
 */
public class SMSService implements NotificationMedium {

    /**
     * Sends a notification message using SMS.
     *
     * @param message the message content to be delivered
     */
    @Override
    public void send(String message) {
        System.out.println("[SMS] Sending message: " + message);
    }
}
