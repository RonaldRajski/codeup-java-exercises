//Ronald Rajski
//COSC 1336
//        Instructor: Dr. Doerschuk
//        Programming Assignment 9
//        Due:  4/28/2021

//<brief description of the problem that the program was written to solve>

//Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle.   The class contains:
//        •	Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height. X
//        •	A no-arg constructor that creates a default rectangle.
//        •	A constructor that creates a rectangle with the specified width and height.
//        •	A method named getWidth() that returns the width of this rectangle.
//        •	A method named getHeight() that returns the height of this rectangle.
//        •	 A method named getArea() that returns the area of this rectangle.
//        •	A method named getPerimeter() that returns the perimeter.
//        Draw the UML diagram for the class and then implement the class.
//        Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9.   Display the width, height, area, and perimeter of each rectangle in this order.
//        Your program’s output should look like the sample shown below:
//        The area of a rectangle with width 4.0 and height 40.0 is 160.0
//        The perimeter of the rectangle is 88.0
//        The area of a rectangle with width 3.5 and height 35.9 is 125.64999999999999
//        The perimeter of the rectangle is 78.8
//        Store the source code in a file named MyRectangle<your_name>.java.

//UML Class Diagram
///**************************************************
// *               Rectangle                         *
// * ------------------------------------------------*
// * width: double                                   *
// * height: double                                  *
// * Rectangle()                                     *
// * Rectangle(width: double, height: double)  *
// * getArea(): double                               *
// * getPerimeter(): double                          *
// ***************************************************/

package Practice4.ProgramingAssignments.ProgrammingAssignment9;

public class MyRectangleRonaldRajski {
    double width;    // Width of rectangle
    double height;    // Height of rectangle

    /**
     * A no-arg constructor that creates a default rectangle
     */
    MyRectangleRonaldRajski() {
        width = 1;
        height = 1;
    }

    /**
     * A constructor that creates a rectangle
     * with the specified width and height
     */
    public MyRectangleRonaldRajski(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    /**
     * Return the area of this rectangle
     */
    double getArea() {
        return width * height;
    }

    /**
     * Return the perimeter of this rectangle
     */
    double getPerimeter() {
        return 2 * (width + height);
    }

}

