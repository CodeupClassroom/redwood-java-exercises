package shapes;

public class Circle {
    private double radius;

    public Circle(double aRadius) {
        radius = aRadius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
