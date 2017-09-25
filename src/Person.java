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
    private String firstName;
    private String lastName;

    public /* no return type*/ Person /* the same as the class */(
        String aFirstName, String aLastName
    ) {
        firstName = aFirstName;
        lastName = aLastName;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}
