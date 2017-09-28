package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        System.out.println("inside of Rectangle#getPerimeter");
        return 2 * this.length + 2 * this.width;
    }

    public int getArea() {
        System.out.println("inside of Rectangle#getArea");
        return this.length * this.width;
    }
}
