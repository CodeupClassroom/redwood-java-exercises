package inheritance;

import java.util.Scanner;

public class Developer extends Employee implements WritesCode, QA {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Code code code");
    }

    @Override
    public Scanner[] writeCode(int numberOfLines) {
        System.out.println("Writes...");
        return new Scanner[0];
    }

    @Override
    public boolean debug(Scanner bug) {
        System.out.println("Kill bugs...");
        return false;
    }

    @Override
    public boolean test(String code){
        return true;
    }
}
