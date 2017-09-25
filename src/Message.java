/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public boolean isSilence() {
        return message.isEmpty();
    }

    public boolean isShouting() {
        return (message.endsWith("!") || message.equals(message.toUpperCase()))
            && !message.isEmpty();
    }

    public boolean isQuestion() {
        return message.endsWith("?");
    }
}
