package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(4, 5);
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());

        Rectangle sqr = new Square(5);
        System.out.println(sqr.getArea());
        System.out.println(sqr.getPerimeter());

    }
}
