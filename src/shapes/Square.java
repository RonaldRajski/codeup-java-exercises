package shapes;

public class Square extends Rectangle {

    public Square (double side) {
        super(side, side);
    }
    @Override

    public double getArea(){
        return Math.pow(this.length, 2);
    }
    @Override
    public double getPerimeter(){
//        System.out.println("Square Perimeter");
        return 4 * this.width;
    }

}
