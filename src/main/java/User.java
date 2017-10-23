package main.java;/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

/* Create a class called User that inherits from Person */
public class User extends Person {
    /* Add a protected property called isAdmin that is a boolean */
    protected boolean isAdmin;

    /* Accept a 3rd parameter, a boolean of whether or not that user is an administrator */
    public User(String firstName, String lastName, boolean isAdmin) {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }

    /* Returns a boolean if the contact is an administrator */
    public boolean isAdmin() {
        return isAdmin;
    }
}
