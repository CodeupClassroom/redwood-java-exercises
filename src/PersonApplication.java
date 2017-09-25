/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("Zach", "Gulde"); // Default constructor

        // API - Application Programming Interface
        // REST API - Remote program
        // Object API  - Any public attribute/method
        // person.firstName = "Zach"; // no longer valid
        // person.lastName = "Gulde"; // no longer valid

        System.out.println(person.fullName());
    }
}
