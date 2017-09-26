import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a number between 1 and 10");
        int number = input.getInt(1, 10);

        System.out.println("You enetered: " + number);
    }
}
