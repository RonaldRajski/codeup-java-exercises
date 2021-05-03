package Practice4.ProgramingAssignments.ProgrammingAssignment10;

public class MyRectangle2dTestRonaldRajski {
//    Main Method
public static void main(String[] args) {
//    Create a myRectangle2D object
    MyRectangle2dRonaldRajski r1 = new MyRectangle2dRonaldRajski(2,2,5.5,4.9);

    System.out.println("\nRectangle");
    System.out.println("Area: " + r1.getArea());
    System.out.println("Perimeter: " + r1.getPerimeter());
    System.out.println(r1.contains(3,3) ? "Contains" : "Does not contain") + " the point (3,3).";
    System.out.println(r1.contains(new MyRectangle2dRonaldRajski(4,5,10.5,3.2)) ? "Contains" : "Does Not contain") + "  the rectangle with points (4, 5, 10.5, 3.2)");
    System.out.println(r1.overlaps(new MyRectangle2dRonaldRajski(3,5,2.3,5.4)) ? "Overlaps" : "Does not overlap" + "the rectangle with points (3,5,2.3,5.4)");

}


}

