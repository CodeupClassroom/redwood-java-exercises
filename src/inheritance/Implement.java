package inheritance;

public class Implement {

    public static void main(String[] args) {

        Employee fer = new Developer("Fer", 1);
        fer.work();

        Employee luisa = new Accountant("Luisa", 1);
        luisa.work();

    }
}
