package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        double side = this.width;
        return side * 4;
    }

    @Override
    public double getArea() {
        double side = this.length;
        return Math.pow(side, 2);
    }
}
