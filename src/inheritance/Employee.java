package inheritance;

import superclasses.Person;

abstract class Employee extends Person {

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

    abstract public void work();

    public void sayHello() {
        System.out.println("Hello, " + super.getName() + ", how can i help you with!");
    }


}
