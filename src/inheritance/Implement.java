package inheritance;

import superclasses.Person;

public class Implement {

    public static void main(String[] args) {
        final String numberOfPeople = "192.";

        // This is a constant and the value doesn't chance
//        numberOfPeople = "fer";

        Employee fer = new Employee("Fer", 100000000);
        fer.sayHello();
        fer.work();

        Person luis = new Person("Luis");
        luis.sayHello();

        Baby lucy = new Baby("Lucy");
        lucy.cry();

    }
}
