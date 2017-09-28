package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(4, 5);

        Rectangle sqr = new Square(5);

        Rectangle[] recs = {rec, sqr};

        for (Rectangle r : recs){
            System.out.println(r.getArea());
            System.out.println(r.getPerimeter());
        }



    }
}
