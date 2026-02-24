/**
 * Concrete implementation of NotificationMedium that simulates
 * sending messages via Email.
 *
 * Responsibilities:
 * - Implements Email-based delivery behavior
 * - Adheres to NotificationMedium contract
 *
 * @author Will Shahbazian
 * @version 1.0
 */
public class EmailService implements NotificationMedium {

    /**
     * Sends a notification message using Email.
     *
     * @param message the message content to be delivered
     */
    @Override
    public void send(String message) {
        System.out.println("[Email] Sending message: " + message);
    }
}
