package shapes;

//public class Square extends Rectangle {
//
//    public Square (double side) {
//        super(side, side);
//    }
//    @Override
//
//    public double getArea(){
//        return Math.pow(this.length, 2);
//    }
//    @Override
//    public double getPerimeter(){
////        System.out.println("Square Perimeter");
//        return 4 * this.width;
//    }
//}

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    protected double setLength(double side) {
        return side;
    }

    @Override
    protected double setWidth(double side) {
        return side;
    }

    @Override
    public double getPerimeter() {
        return this.side * this.side;
    }

    @Override
    public double getArea() {
        return 4 * this.side;
    }
}
