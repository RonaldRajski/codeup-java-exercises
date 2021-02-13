package PearsonPractice.Chapter2;

import java.util.Scanner;

public class ComputeAreaWithFinal24 {
    public static void main(String[] args) {
        final double PI = 3.14159;

//        create a scanner object
        Scanner input = new Scanner(System.in);

//        prompt user to enter radius

        System.out.println("Enter a number for a radius: ");
        double radius = input.nextDouble();

//        ComputeArea
        double area = radius*radius *PI;

//        Display result

        System.out.println("The area for the circle of the radius " + radius +  " is " + area);

        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = KILOMETERS_PER_MILE * miles;
        System.out.println(kilometers);


    }

//    2.71

//    To declare a constant MAX_LENGTH inside a method with value 99.98, you write

//    final double MAX_LENGTH = 99.98;

//    final consts are identified by final CAPWORDORTHING


}
