package shapes;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
        return super.getLength() * super.getWidth();
    }

    public double getPerimeter(){
        return super.getWidth() * 4;
    }

}
