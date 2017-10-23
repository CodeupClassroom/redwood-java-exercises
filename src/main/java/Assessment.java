/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package main.java;

public class Assessment {
    /*
     * Write a static method called `square(number)` accepts an integer as input
     * and returns that number times itself.
     */
    public static int square(int number) {
        return number * number;
    }

    /* Write a static method sum(param1, param2) that works with integers */
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    /* Write a static method sum(param1, param2) that works with doubles */
    public static float sum(float number1, float number2) {
        return number1 + number2;
    }

    /*
     * Write a static method called average(arrayOfIntegers) that takes in an array of integers and
     * returns the average as a double
     */
    public static double average(int[] arrayOfIntegers) {
        double sum = 0.0;
        for (int number: arrayOfIntegers) {
            sum += number;
        }
        return sum / arrayOfIntegers.length;
    }

    public static void main(String[] args) {
        System.out.println("The square of 3 is " + square(3));
        System.out.println("The square of -2 is " + square(-2));
        System.out.println("Tests for sum using integers");
        System.out.println("4 + (-18) is " + sum(4, -18));
        System.out.println("(-4) + (-4) is " + sum(-4, -4));
        System.out.println("Tests for sum using floats");
        System.out.println("4.5 + (-15.5) is " + sum(4.5f, -15.5f));
        System.out.println("(-4.4) + (-4.6) is " + sum(-4.4f, -4.6f));

        int[] numbers = {1, 2, 3};
        System.out.println("The average of [1, 2, 3] is " +  average(numbers));
    }
}