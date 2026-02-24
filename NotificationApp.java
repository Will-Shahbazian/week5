/**
 * Entry point for demonstrating the Flexible Notification System.
 *
 * Demonstrates:
 * - Composition-based behavior swapping
 * - Runtime medium switching
 * - Session logging via ArrayList
 *
 * Execution:
 * Compile: javac *.java
 * Run:     java NotificationApp
 *
 * @author Will Shahbazian
 * @version 1.0
 */
public class NotificationApp {

    /**
     * Main method for CLI execution.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        AlertSystem alertSystem = new AlertSystem();

        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("Your invoice is ready.");

        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("Your verification code is 123456.");

        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("Your delivery is arriving soon.");

        System.out.println("\n--- Notification Log ---");
        for (String logEntry : alertSystem.getMessageLog()) {
            System.out.println(logEntry);
        }
    }
}
