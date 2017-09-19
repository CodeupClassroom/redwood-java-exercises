/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input; // null // every scanner works with a delimiter -> ' ' by default
        input = new Scanner(System.in); // in JS constructor function, in Java constructor

        // var stringValue = prompt("");
        System.out.println("Enter an integer value");
        // You'll get an InputMismatchException if you don't provide an integer
        int number = input.nextInt(); // 1234[enter]
        System.out.println(number);


        System.out.println("Enter 3 words\n");
        String wordOne = input.next(); // [enter]coding
        String wordTwo = input.next(); // [space]is
        String wordThree = input.next(); // [space]awesome[enter]

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        input.nextLine(); // This is the extra \n (enter)

        System.out.println("Enter a sentence");
        String sentence = input.nextLine(); //
        System.out.println(sentence);

        // wrapper classes
        // int -> Integer, float -> Float, double -> Double, long -> Long
        // input
        System.out.println("Enter the width of the classroom");
        double width = Double.parseDouble(input.nextLine()); // input.nextDouble();
        System.out.println("Enter the length of the classroom");
        double length = Double.parseDouble(input.nextLine());
        // process
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        // output
        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);
    }
}
