/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class PersonApplication {
    public static void main(String[] args) {
//        Person person = new Person("Zach", "Gulde"); // Default constructor
//        System.out.println(Person.population);
//        Person ryan = new Person("Ryan", "Orsinger"); // Default constructor
//        System.out.println(Person.population);
//
//        System.out.println(person.fullName());


        // I don't need to create an instance of Arithmetic
        // because the method is class level or static
        System.out.println(Arithmetic.sum(6, 89));
        System.out.println(Arithmetic.subtract(6, 89));

        // API - Application Programming Interface
        // REST API - Remote program
        // Object API  - Any public attribute/method
        // person.firstName = "Zach"; // no longer valid
        // person.lastName = "Gulde"; // no longer valid

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
    }
}
