/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class Bob {
    public String  respondTo(Message message) {
        if (message.isQuestion()) {
            return "Sure";
        } else if (message.isShouting()) {
            return "Whoa, chill out!";
        } else if (message.isSilence()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever";
        }
    }
}
