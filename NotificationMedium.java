/**
 * Defines the contract for all notification delivery mechanisms.
 *
 * Implementations of this interface encapsulate message delivery
 * behavior for different communication technologies.
 *
 * Architectural Role:
 * - Enables runtime behavior swapping
 * - Supports Open-Closed Principle (OCP)
 * - Promotes composition over inheritance
 *
 * Design Principle:
 * - Strategy Pattern foundation
 *
 * @author Will Shahbazian
 * @version 1.0
 */
public interface NotificationMedium {

    /**
     * Sends a notification message using a specific medium.
     *
     * @param message the message content to be delivered
     */
    void send(String message);
}
