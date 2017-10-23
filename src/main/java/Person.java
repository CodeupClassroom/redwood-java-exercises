/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package main.java;

/* Create a class named Person inside of src/main/java */
public class Person {
    /* Add firstName and lastName as protected properties. */
    protected String firstName;
    protected String lastName;

    /* Add a constructor method that takes in two strings that are firstName and lastName. */
    public Person(String firstName, String lastName) {
        /*
         * If the firstName or lastName inputs are null, be sure to throw an IllegalArgumentException
         * inside of the constructor.
         */
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Neither the first nor the last name can be null");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }
}
