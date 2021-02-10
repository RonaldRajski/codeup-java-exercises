package JavaProgramingMasterclass.Point;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

//    Methods

//    method named distance no parameters

    public double distance(){
        Point defaultPoint = new Point(0,0);
        return this.distance(defaultPoint);
    }

    public double distance(Point point){
        double xValue = Math.pow((double) point.getX() - this.x, 2); //The this.x is used to gather the value of x for the current object which is the object that is calling the method
        double yValue = Math.pow((double) point.getY() - this.y, 2); //the this.y is used to gather the value of y for the current object which is the object that is calling the method
        double distance = Math.sqrt(xValue + yValue);
        return distance;
    }

    public double distance(int x, int y){
        Point userProvidedPoint = new Point(x,y);
        return this.distance(userProvidedPoint); //The this keyword is used to reference the current object
    }


}
