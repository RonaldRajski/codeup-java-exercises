package PearsonPractice.ProgrammingAssignment1;


//Ronald Rajski
//COSC 1336
//        Instructor: Dr. Doerschuk
//        Programming Assignment 1
//        Due:  2/10/2021
//Write a program that computes and displays the area and perimeter of a rectangle with a width of 8.2 and a height of 10.3 using these formulas:
//        area = height X width
//        perimeter = 2 X (height + width)
//        Your program’s output should look like the sample shown below:
//        84.46
//        37.0


public class RectangleRonaldRajski {

    public static void main(String args[]) {
        double width = 8.2;
        double height = 10.3;
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println(area);
        System.out.println(perimeter);
    }
}






