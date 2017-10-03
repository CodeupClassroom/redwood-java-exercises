package exceptions;

import util.Input;

import java.util.Scanner;

public class ExceptionalApplication {
    public static void main(String[] args) throws WrongIndentationTypeException {

        askIndentationPreference();

//        try {
//            askIndentationPreference();
//        } catch (WrongIndentationTypeException e) {
//            System.out.println("Exception caught!");
//        }


//        Input input = new Input();
//        int[] numbers = {1, 2, 3, 4, 5};
//        throw new Exception("asdf");

//        try {
//            System.out.println(numbers[16]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Here is the exception message: ");
//            System.out.println(e.getMessage());
//        }

//        System.out.println("What index would you like to access?");
//        int index = input.getInt();
//
//        try {
//            // code that could produce an error
//            System.out.println("Here is your number: " + numbers[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // code to handle the error
//            System.out.println("undefined");
//        }

        // catches *must* be more specific -> less specific
//        try {
//            System.out.println("Let's see...");
//            throw new ArrayIndexOutOfBoundsException("My Exception");
//            int n = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("1");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("3");
//        } finally {
//            System.out.println("this will always run");
//        }


//        try {
//            thisWillThrowAnException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public static void thisWillThrowAnException() throws Exception {
        throw new Exception("throwing...");
    }

    public static void trySomeThings() {
        try {
            thisWillThrowAnException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void askIndentationPreference() throws WrongIndentationTypeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            WrongIndentationTypeException e;
            e = new WrongIndentationTypeException("Spaces are superior!");
            throw e;
        }
    }

}
