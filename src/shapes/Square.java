package shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public int getPerimeter() {
        System.out.println("inside of Square#getPerimeter");
        int side = this.length;
        return 4 * side;
    }

    public int getArea() {
        System.out.println("inside of Square#getArea");
        int side = this.length;
        return (int) Math.pow(side, 2);
    }
}
