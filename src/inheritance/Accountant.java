package inheritance;

public class Accountant extends Employee{

    public Accountant(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("Does stuff numbers");
    }
}
