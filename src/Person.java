/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

/*
 * - public -> anyone has access to this class/attribute/function
 * - private ->  no-one can see this class/attribute/function
 *
 * - client (object that calls a method on another object)
 * - server (object that does an operation on behalf of another object)
 */
public class Person {
    // class or static variables
    public static int population = 0; // shared

    // instance or object variables
    private String firstName;
    private String lastName;

    public  Person (
        String aFirstName, String aLastName  // constructor parameters
    ) {
        population++;
        firstName = aFirstName; // local variable
        lastName = aLastName;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}
