import java.util.Scanner;

public class BobApplication {
    /**
     * **Whatever**  "Tom-ay-to, tom-ahh-to." "Let's go behind the gym!"
     * "It's OK if you don't want to go" "1, 2, 3"
     * **Whoa, chill out!** "WATCH OUT!" "WHAT THE HELL WERE YOU THINKING?" "1, 2, 3 GO!"
     * "%^*&@# ZOMBIES ARE COMING!!!1!1!"
     * **Sure.** "Does this cryogenic chamber make me look fat?" "You are, what, like 15?" "4?"
     * **Fine be that way** "" "     " "            "
     */
    public static void main(String[] args) {

        while (true) {
            // input
            Scanner input = new Scanner(System.in);
            System.out.println("Ask anything");
            String msg = input.nextLine();

            // process
            Bob bob = new Bob();
            System.out.println(bob.respondTo(new Message(msg)));

            // output
            System.out.println("Continue? y,n");
            String option = input.nextLine();
            if (!option.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
