package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        int number = input.getInt();
        System.out.println("Your number is: " + number);


        double anotherNum = input.getDouble();
        System.out.println("Your double is: " + anotherNum);


        System.out.println("We almost finish");
    }
}
