package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo() {
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt() {

        try{
            int input = Integer.valueOf(getString());
            return input;
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("That's not an integer! Try again.");
            return getInt();
        }

//        if (this.scanner.hasNextInt()) {
//            int input = this.scanner.nextInt();
//            scanner.nextLine();
//            return input;
//        } else {
//            System.out.println("That's not an integer! Try again.");
//            scanner.nextLine();
//            return getInt();
//        }

    }

    public int getInt(int min, int max) {
        int userInput = getInt();

        if (userInput < min || userInput > max) {
            System.out.println(userInput + " is not between " + min + " and " + max);
            return getInt(min, max);
        }

        return userInput;
    }

    public double getDouble() {

        try{
            double input = Double.valueOf(getString());
            return input;
        }catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
            System.out.println("That's not an double! Try again.");
            return getDouble();
        }

//        if (this.scanner.hasNextDouble()) {
//            return this.scanner.nextDouble();

//        } else {
//            System.out.println("That's not an double! Try again.");
//            scanner.nextLine();
//            return getDouble();
//        }
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();

        if (userInput < min || userInput > max) {
            System.out.println(userInput + " is not between " + min + " and " + max);
            return getDouble(min, max);
        }

        return userInput;
    }

}
