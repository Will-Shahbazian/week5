/**
 * Concrete implementation of NotificationMedium that simulates
 * sending messages via WhatsApp.
 *
 * Maintenance &amp; Evolution Extension:
 * - Added without modifying core system components
 * - Preserves Open-Closed Principle (OCP)
 *
 * Responsibilities:
 * - Implements WhatsApp-based delivery behavior
 * - Adheres to NotificationMedium contract
 *
 * @author Will Shahbazian
 * @version 1.0
 */
public class WhatsAppService implements NotificationMedium {

    /**
     * Sends a notification message using WhatsApp.
     *
     * @param message the message content to be delivered
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}
