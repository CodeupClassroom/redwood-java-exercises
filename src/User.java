/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import main.java.Person;

/* Create a class called User that inherits from Person */
public class User extends Person {
    /* Add a protected property called isAdmin that is a boolean */
    protected boolean isAdmin;

    public User(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
