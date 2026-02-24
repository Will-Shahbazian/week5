/**
 * Simple CLI test script for validating WhatsAppService behavior.
 *
 * This test verifies:
 * - WhatsAppService correctly implements NotificationMedium
 * - Messages are delivered properly
 * - Messages are logged by AlertSystem
 *
 * @author Will Shahbazian
 * @version 1.0
 */
public class WhatsAppServiceTest {

    /**
     * Entry point for CLI testing.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        AlertSystem alertSystem = new AlertSystem();

        // Set WhatsApp medium
        alertSystem.setMedium(new WhatsAppService());

        // Send test messages
        alertSystem.notifyUser("Test message 1");
        alertSystem.notifyUser("Test message 2");

        // Display log to verify composition behavior
        System.out.println("\n--- Log Verification ---");
        for (String logEntry : alertSystem.getMessageLog()) {
            System.out.println(logEntry);
        }
    }
}
