package shapes;

import java.util.Scanner;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);

        System.out.println("--\nShowing information for box1 ...");
        showRectangleInfo(box1);
        System.out.println("--\nShowing information for box2 ...");
        showRectangleInfo(box2);
    }

    public static void showRectangleInfo(Rectangle r) {
        System.out.println("area: " + r.getArea());
        System.out.println("perimeter: " + r.getPerimeter());
    }

}
