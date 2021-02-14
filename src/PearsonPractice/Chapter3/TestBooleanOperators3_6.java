package PearsonPractice.Chapter3;

import java.util.Scanner;

public class TestBooleanOperators3_6 {

    public static void main(String[] args) {
//        Create Scanner

        Scanner input = new Scanner(System.in);

//        Receive input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if(number % 2 == 0 && number % 3 == 0){
            System.out.println(number + " is divisible  by 2 & 3");
        }
        if(number % 2 == 0 || number % 3 == 0){
            System.out.println(number + " is divisible by 2 or 3.");
        }
        if(number % 2 == 0 ^ number % 3 == 0){
            System.out.println(number + " divisible by 2 or 3, but not by both");
        }



    }

}
