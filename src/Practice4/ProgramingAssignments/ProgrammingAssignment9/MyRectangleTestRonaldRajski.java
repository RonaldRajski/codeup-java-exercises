package Practice4.ProgramingAssignments.ProgrammingAssignment9;

public class MyRectangleTestRonaldRajski {
    public static void main(String[] args) {

//        Create a rectangle with a width of 4 and a height of 40
        MyRectangleRonaldRajski rectangle1 = new MyRectangleRonaldRajski(4,40);


//        Create a rectangle with a width of 3.5 and a height of 35.9
        MyRectangleRonaldRajski rectangle2 = new MyRectangleRonaldRajski(3.5, 35.9);

//        output

//        The area of a rectangle with width 4.0 and height 40.0 is 160.0
        System.out.println("The area of a rectangle with a width of " + rectangle1.getWidth() + " and a height of " + rectangle1.getHeight() + " is "  + rectangle1.getArea());
//        The perimeter of the rectangle is 88.0
        System.out.println("The perimeter of the rectangle is " + rectangle1.getPerimeter());
//        The area of a rectangle with width 3.5 and height 35.9 is 125.64999999999999
        System.out.println("The area of a rectangle with a width of " + rectangle2.getWidth() + " and a height of " + rectangle2.getHeight() + " is "  + rectangle2.getArea());
//        The perimeter of the rectangle is 78.8
        System.out.println("The perimeter of the rectangle is " + rectangle2.getPerimeter());
//
    }
}
