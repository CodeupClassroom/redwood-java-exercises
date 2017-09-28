package shapes;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
        System.out.println("Square.getArea");
        return super.getLength() * super.getWidth();
    }

    public double getPerimeter(){
        System.out.println("Square.getPerimeter");
        return super.getWidth() * 4;
    }

}
