/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class PersonApplication {
    public static void main(String[] args) {
        //Person person = new Person("Zach", "Gulde"); // Default constructor

        // API - Application Programming Interface
        // REST API - Remote program
        // Object API  - Any public attribute/method
        // person.firstName = "Zach"; // no longer valid
        // person.lastName = "Gulde"; // no longer valid

        //System.out.println(person.fullName());
        // this.name = name;
        Student student = new Student("Fernando");
        Student enrolledStudent = new Student("Justin", "Redwood");

        // 2 types of messages: questions and commands
        // a question
        if (student.isEnrolled()) {
            System.out.println(student.getCohort());
        }

        if (enrolledStudent.isEnrolled()) {
            System.out.println(enrolledStudent.getCohort());
        }


        //student.

    }
}
