/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        // System.out.println("5" == 5); //  no need for identical operation like in JS

        System.out.println(3 == 5);
        System.out.println(3.5 >= 5);

        float number = 4.3f;
        int integerNumber = 4;

        // Java will choose the more precise type
        System.out.println(number > integerNumber);
        System.out.println(number == integerNumber);

        System.out.println(3 > 0 || false);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int aNumber = input.nextInt();
        if (aNumber % 2 == 0) {
            System.out.println(aNumber + " is even");
        } else  {
            System.out.println(aNumber + " is odd");
        }

        input.nextLine();
        System.out.println("Enter the name of your cohort");
        String cohort = input.nextLine();
        String expectedCohort = "Redwood";
        System.out.println("Redwood" == "Redwood");
        System.out.println("Redwood" == cohort);  // are this 2 objects the same
        System.out.println(expectedCohort == cohort);  // are this 2 objects the same
        System.out.println(cohort.equals("Redwood")); // are this 2 string equal in content
        System.out.println("Redwood".equals(cohort)); // are this 2 string equal in content
        System.out.println(expectedCohort.equals(cohort)); // are this 2 string equal in content

        int age = 20;
        switch (age) {  // Only strings and integer values are valid inputs for a switch
            case 20:
                System.out.println("You are 20 years old");
                break; // Fallthrough works the same way in Java
            default:
                System.out.println("You are " + age  + " years old");
        }

        // modulus using a while ?
        System.out.println("Enter a dividend");
        int dividend = input.nextInt();
        System.out.println("Enter a divisor");
        int divisor =  input.nextInt();

        int remainder = dividend;

        while (remainder > divisor) {
            remainder -= divisor; // 2
        }

        System.out.println(
            "The remainder of " + dividend + " divided by " + divisor + " is " + remainder
        );


        int positiveNumber;
        do {
            System.out.println("Enter a positive number");
            positiveNumber = input.nextInt();
        } while (positiveNumber <= 0);


        int base = 2;
        int exponent = 5; // 3^5  -> 32
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("2^5 = " + result);


        int secretNumber = 12;
        int guess;
        int chances = 0;

        do {
            System.out.println("Guess the number between 1 and 20");
            guess = input.nextInt();
            chances++;

            if (chances == 3) {
                break;
            }
        } while (guess != secretNumber);

        if (guess == secretNumber) {
            System.out.println("yay");
        } else {
            System.out.println("nay");
        }

        // Continue
        for(int counter = 0; counter <= 10;counter++){
            if(counter == 5){
                System.out.println("Five");
                continue;
            } else if(counter == 8){
                System.out.println("Ocho");
                continue;
            }

            System.out.println("counter = " + counter);
        }


    }
}
