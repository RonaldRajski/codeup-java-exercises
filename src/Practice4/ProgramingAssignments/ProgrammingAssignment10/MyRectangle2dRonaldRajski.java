//Ronald Rajski
//COSC 1336
//        Instructor: Dr. Doerschuk
//        Programming Assignment 10
//        Due:  5/2/2021
//<brief description of the problem that the program was written to solve>

//Define the MyRectangle2D class that contains:
//        •	Two double data fields named x and y that specify the center of the rectangle, with getter and setter methods. (Assume the rectangle sides are parallel to the x- or y- axis).
//        •	Two double data fields named width and height that specify the width and height of the rectangle, with getter and setter methods.
//        •	A no-arg constructor that creates a default rectangle with (0,0) for (x,y) and 1 for both width and height.
//        •	A constructor that creates a rectangle with the specified x, y, width and height.
//        •	A method named getArea() that returns the area of this rectangle.
//        •	A method named getPerimeter() that returns the perimeter of the rectangle.
//        •	A method contains(double x, double y) that returns true if the specified point (x,y) is inside this rectangle
//        •	A method contains(MyRectangle2D r) that returns true if the specified rectangle is inside this rectangle.
//        •	A method overlaps(MyRectangle2D r) that returns true if the specified rectangle overlaps this rectangle.
//        Draw the UML diagram for the class and then implement the class.
//        Write a test program that creates a MyRetangle2D object r1 (new MyRectangle2D(2, 2, 5.5, 4.9)) , displays its area and perimeter, and displays the result of r1.contains(3,3), r1.contains(new MyRectangle2D(4, 5,10.5, 3.2)) and r1.overlaps (new MyRectangle2D(3, 5, 2.3, 5.4)).
//        Your program’s output should look like the sample shown below:
//        rectangle r1 is centered at (2.0,2.0) with width 5.5 and height 4.9
//        Area is 26.950000000000003
//        Perimeter is 20.8
//        r1 contains (3,3) is true
//        r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) is false
//        r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) is true


/**********************************************************************
 *                          MyRectangle2D                              *
 *---------------------------------------------------------------------*
 * -x: double                                                          *
 * -y: double                                                          *
 * -width: double                                                      *
 * -height: double                                                     *
 * +MyRectangle2DRonaldRajski()                                                    *
 * +MyRectangle2DRonaldRajski(x: double, y: double, width: double, height: double) *
 * +setX(x: double )                                                   *
 * +setY(y: double)                                                    *
 * +getX(): double                                                     *
 * +getY(): double                                                     *
 * +setHeight(heigth: double)                                          *
 * +setWidth(width: double)                                            *
 * +getHeight(): double                                                *
 * +getWidth(): double                                                 *
 * +getArea(): double                                                  *
 * +getPermeter(): double                                              *
 * +contains(r: MyRectangle2D)                                         *
 * +contains(x: double, y: double)                                     *
 * +overlaps(r: MyRectangle2D)                                         *
 **********************************************************************/

package Practice4.ProgramingAssignments.ProgrammingAssignment10;

public class MyRectangle2dRonaldRajski {
    private double x;
    private double y;
    private double width;
    private double height;

    MyRectangle2dRonaldRajski(){
        this(0,0,1,1);
    }

    public MyRectangle2dRonaldRajski(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    /** Returns true if the specified point(x, y)
     *   is inside the rectangle */
    public boolean contains(double x, double y) {
        return getDistance(this.y, y) <= height / 2 &&
                getDistance(this.x, x) <= width / 2;
    }

    /** Returns true if the specified
     *   rectangle is inside this rectangle */
    public boolean contains(MyRectangle2dRonaldRajski r) {
        return
                getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                        getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                        height / 2 + r.getHeight() / 2 <= height &&
                        width / 2 + r.getWidth() / 2 <= width;
    }

    /** Returns true if the specified rectangle
     *   overlaps with this rectangle */
    public boolean overlaps(MyRectangle2dRonaldRajski r) {
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }

    /** Return distance */
    private double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));

    }

}





