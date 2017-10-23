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

    public static void main(String[] args) {
        System.out.println("The square of 3 is " + square(3));
        System.out.println("The square of -2 is " + square(-2));
    }
}
