package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter the radius: ");

        Circle myCircle = new Circle(input.getDouble());

        System.out.println("The area is: " + myCircle.getArea());
        System.out.println("The circumference is: " + myCircle.getCircumference());
    }
}
