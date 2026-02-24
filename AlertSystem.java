import java.util.ArrayList;
import java.util.List;

/**
 * Core container class responsible for notification orchestration.
 *
 * This class uses composition to delegate notification delivery
 * to interchangeable NotificationMedium implementations.
 *
 * Key Responsibilities:
 * - Delegates notification behavior
 * - Maintains session-based message log
 * - Supports runtime medium switching
 *
 * Architectural Significance:
 * - Demonstrates Strategy Pattern
 * - Preserves system flexibility
 * - Supports Open-Closed Principle (OCP)
 *
 * AI Usage Statement:
 * Generative AI was used as a collaborative design assistant.
 * All architectural decisions, validation, and refinement were
 * performed by the developer.
 *
 * @author Will Shahbazian
 * @version 1.0
 */
public class AlertSystem {

    /** Active notification delivery mechanism */
    private NotificationMedium medium;

    /** Session log of all messages sent */
    private final List<String> messageLog;

    /**
     * Constructs an AlertSystem with an empty message log.
     */
    public AlertSystem() {
        this.messageLog = new ArrayList<>();
    }

    /**
     * Sets or replaces the active notification medium.
     *
     * This enables runtime behavior swapping without modifying
     * system logic.
     *
     * @param medium the notification medium to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a notification using the active medium.
     *
     * The message is recorded in the session log.
     *
     * @param message the message content to deliver
     */
    public void notifyUser(String message) {

        if (medium == null) {
            System.out.println("No notification medium configured.");
            return;
        }

        medium.send(message);
        messageLog.add(message);
    }

    /**
     * Returns the session notification log.
     *
     * @return list of messages sent during this session
     */
    public List<String> getMessageLog() {
        return messageLog;
    }
}
