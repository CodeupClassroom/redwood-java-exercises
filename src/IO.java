import java.util.Scanner;

public class IO {

    public static void main(String[] args) {
        // Creates an instance of the Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your name:");
        String name = scan.nextLine();

        System.out.println("Give me your age:");
        byte age = scan.nextByte();

        System.out.println("Your name is " +name + " and your age is: " + age);


        // If there's no problems this will run
        System.out.println("Do i run?");
    }

}
