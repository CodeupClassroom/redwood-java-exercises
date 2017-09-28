package inheritance2;

public class InheritanceApplication {
    public static void main(String[] args) {
        Person eitherAPersonOrASuperhero = new SuperHero("Clark Kent", "Superman");
//        Person eitherAPersonOrASuperhero = new Person("Clark Kent");

        System.out.println(eitherAPersonOrASuperhero.getName());



//        // the type of the variable is the superclass,
//        // but it contains an object of type of the subclass
//        Employee someEmployee = new Manager();
//        Manager manager = new Manager();
//
//        doWorkandPrintIt(manager);
//        doPayroll(manager);
    }

    public static void doWorkandPrintIt(Employee employee) {
        System.out.println(employee.doWork());
    }

    public static void doPayroll(Employee employee) {
        System.out.println(employee.getSalary());
    }
}
