package Practice4.ProgramingAssignments.ProgrammingAssignment10;

public class MyRectangle2dTestRonaldRajski {
//    Main Method
public static void main(String[] args) {
//    Create a myRectangle2D object
    MyRectangle2dRonaldRajski r1 = new MyRectangle2dRonaldRajski(2,2,5.5,4.9);


    System.out.println("rectangle r1 is centered at (" +r1.getX() + "," +r1.getY() + ") with width " +r1.getWidth()+  " and height " + r1.getHeight());
    System.out.println("Area is " + r1.getArea());
    System.out.println("Perimeter is " + r1.getPerimeter());
    System.out.println((r1.contains(3, 3) ? "r1 Contains" : " r1 Does not contain") + " the point (3, 3) is true");
    System.out.println((r1.contains(new MyRectangle2dRonaldRajski(4, 5, 10.5, 3.2)) ? "r1.contains" : "r1:contains") + " (new MyRectangle2D(4, 5, 10.5, 3.2) is false");
    System.out.println((r1.overlaps(new MyRectangle2dRonaldRajski(3, 5, 2.3, 5.4)) ? "r1.overlaps" : "r1:overlaps") + " (new MyRectangle2D(3, 5, 2.3, 5.4) is true");

}


}

