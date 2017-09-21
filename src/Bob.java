import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        while(true){

            Scanner input = new Scanner(System.in);
            System.out.println("Ask anything");
            String msg = input.nextLine();

            if(msg.endsWith("?")){
                System.out.println("Sure");
            } else if( (msg.endsWith("!") || msg.equals(msg.toUpperCase())) && !msg.isEmpty() ){
                System.out.println("Whoa, chill out!");
            } else if (msg.isEmpty()){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Continue? y,n");
            String option = input.nextLine();
            if(!option.equalsIgnoreCase("y")){
                break;
            }

        }

    }
}
