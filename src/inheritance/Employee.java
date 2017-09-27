package inheritance;

import superclasses.Person;

public class Employee extends Person {

    private double salary;

    public Employee(String name, double salary) {
        // super(name) calls the superclass constructor
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(super.getName() + " is working" );
    }

    public void sayHello() {
        System.out.println("Hello, " + super.getName() + ", how can i help you with!");
    }

}
